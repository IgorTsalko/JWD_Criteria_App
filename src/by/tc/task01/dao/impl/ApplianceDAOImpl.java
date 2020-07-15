package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.exception.DaoException;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.builder.EntityBuilder;
import by.tc.task01.entity.criteria.Criteria;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApplianceDAOImpl implements ApplianceDAO {

	private final Path filePath = Paths.get("E:/Studies/Java/testFolder/appliances_db.txt");
	private final EntityBuilder entityBuilder = new EntityBuilder();

	@Override
	public List<Appliance> find(Criteria criteria) throws DaoException {
		List<Appliance> appliances = new ArrayList<>();

		try (BufferedReader fileReader = Files.newBufferedReader(filePath)) {
			String applianceName = criteria.getGroupSearchName();
			Map<String, String> parameters;
			Appliance appliance;
			String line;
			while ((line = fileReader.readLine()) != null) {
				if (line.startsWith(applianceName) && checkForParameters(line, criteria.getCriteria())) {
					parameters = extractParametersFromLine(line);
					appliance = entityBuilder.createDevice(applianceName, parameters);
					appliances.add(appliance);
				}
			}
		} catch (IOException e) {
			throw new DaoException("Проблема с получением данных");
		}

		return appliances;
	}

	private boolean checkForParameters(String line, Map<String, Object> parameters) {
		boolean result = true;

		for (Map.Entry<String, Object> paramPair : parameters.entrySet()) {
			StringBuilder formedCriterion = new StringBuilder()
					.append(paramPair.getKey())
					.append("=")
					.append(String.valueOf(paramPair.getValue()).toLowerCase());

			if (!line.matches(".+" + formedCriterion + "((, .+)|(\\s*$))")) {
				result = false;
				break;
			}

		}

		return result;
	}

	private Map<String, String> extractParametersFromLine(String line) {
		Map<String, String> parameters = new HashMap<>();
		String lineParameters = line.replaceAll(".*: ", "").trim();

		for (String paramPair : lineParameters.split(",")) {
			String key = paramPair.split("=")[0].trim();
			String value = paramPair.split("=")[1].trim();
			parameters.put(key, value);
		}

		return parameters;
	}
}