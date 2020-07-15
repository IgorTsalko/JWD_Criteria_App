package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

import java.util.Map;

public class Validator {
	
	public static boolean criteriaValidator(Criteria criteria) {
		Map<String, Object> parameters = criteria.getCriteria();

		for (Map.Entry<String, Object> paramPair : parameters.entrySet()) {
			String property = paramPair.getKey();
			Object value = paramPair.getValue();

			/*
			 Можно проверять каждый параметр, не меньше ли числа нуля,
			 не содержат ли строковые значения неподходящих имволов и т.д.
			 Но так как здесь точно не известно какими должны быть входные параметры
			 оставляю проверки на null
			 */
			if (property == null || value == null) {
				return false;
			}
		}

		return true;
	}

}