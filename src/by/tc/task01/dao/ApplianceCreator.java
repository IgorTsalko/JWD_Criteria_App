package by.tc.task01.dao;

import by.tc.task01.dao.exception.DaoException;
import by.tc.task01.entity.*;
import by.tc.task01.entity.builder.*;

import java.util.Map;

public class ApplianceCreator {

    public Appliance createAppliance(String applianceName, Map<String, String> parameters) throws DaoException {
        return switch (applianceName) {
            case "Laptop" -> constructLaptop(parameters);
            case "Oven" -> constructOven(parameters);
            case "Refrigerator" -> constructRefrigerator(parameters);
            case "Speakers" -> constructSpeakers(parameters);
            case "TabletPC" -> constructTabletPC(parameters);
            case "VacuumCleaner" -> constructVacuumCleaner(parameters);
            default -> throw new DaoException("Type of appliance not found!");
        };
    }

    private Laptop constructLaptop(Map<String, String> parameters) {
        return new LaptopBuilder()
                .setBatteryCapacity(parameters.get("BATTERY_CAPACITY"))
                .setOS(parameters.get("OS"))
                .setMemoryRom(parameters.get("MEMORY_ROM"))
                .setSystemMemory(parameters.get("SYSTEM_MEMORY"))
                .setCPU(parameters.get("CPU"))
                .setDisplayInchs(parameters.get("DISPLAY_INCHS"))
                .build();
    }

    private Oven constructOven(Map<String, String> parameters) {
        return new OvenBuilder()
                .setPowerConsumption(parameters.get("POWER_CONSUMPTION"))
                .setWeight(parameters.get("WEIGHT"))
                .setCapacity(parameters.get("CAPACITY"))
                .setDepth(parameters.get("DEPTH"))
                .setHeight(parameters.get("HEIGHT"))
                .setWidth(parameters.get("WIDTH"))
                .build();
    }

    private Refrigerator constructRefrigerator(Map<String, String> parameters) {
        return new RefrigeratorBuilder()
                .setPowerConsumption(parameters.get("POWER_CONSUMPTION"))
                .setWeight(parameters.get("WEIGHT"))
                .setFreezerCapacity(parameters.get("FREEZER_CAPACITY"))
                .setOverallCapacity(parameters.get("OVERALL_CAPACITY"))
                .setHeight(parameters.get("HEIGHT"))
                .setWidth(parameters.get("WIDTH"))
                .build();
    }

    private Speakers constructSpeakers(Map<String, String> parameters) {
        return new SpeakersBuilder()
                .setPowerConsumption(parameters.get("POWER_CONSUMPTION"))
                .setNumberOfSpeakers(parameters.get("NUMBER_OF_SPEAKERS"))
                .setFrequencyRange(parameters.get("FREQUENCY_RANGE"))
                .setCordLength(parameters.get("CORD_LENGTH"))
                .build();
    }

    private TabletPC constructTabletPC(Map<String, String> parameters) {
        return new TabletPCBuilder()
                .setBatteryCapacity(parameters.get("BATTERY_CAPACITY"))
                .setDisplayInches(parameters.get("DISPLAY_INCHES"))
                .setMemoryRom(parameters.get("MEMORY_ROM"))
                .setFlashMemoryCapacity(parameters.get("FLASH_MEMORY_CAPACITY"))
                .setColor(parameters.get("COLOR"))
                .build();
    }

    private VacuumCleaner constructVacuumCleaner(Map<String, String> parameters) {
        return new VacuumCleanerBuilder()
                .setPowerConsumption(parameters.get("POWER_CONSUMPTION"))
                .setFilterType(parameters.get("FILTER_TYPE"))
                .setBagType(parameters.get("BAG_TYPE"))
                .setWandType(parameters.get("WAND_TYPE"))
                .setMotorSpeedRegulation(parameters.get("MOTOR_SPEED_REGULATION"))
                .setCleaningWidth(parameters.get("CLEANING_WIDTH"))
                .build();
    }
}
