package by.tc.task01.entity.builder;

import by.tc.task01.entity.VacuumCleaner;

public class VacuumCleanerBuilder {

    private double powerConsumption;
    private String filterType;
    private String bagType;
    private String wandType;
    private double motorSpeedRegulation;
    private double cleaningWidth;

    public VacuumCleanerBuilder setPowerConsumption(String powerConsumption) {
        this.powerConsumption = Double.parseDouble(powerConsumption);
        return this;
    }

    public VacuumCleanerBuilder setFilterType(String filterType) {
        this.filterType = filterType;
        return this;
    }

    public VacuumCleanerBuilder setBagType(String bagType) {
        this.bagType = bagType;
        return this;
    }

    public VacuumCleanerBuilder setWandType(String wandType) {
        this.wandType = wandType;
        return this;
    }

    public VacuumCleanerBuilder setMotorSpeedRegulation(String motorSpeedRegulation) {
        this.motorSpeedRegulation = Double.parseDouble(motorSpeedRegulation);
        return this;
    }

    public VacuumCleanerBuilder setCleaningWidth(String cleaningWidth) {
        this.cleaningWidth = Double.parseDouble(cleaningWidth);
        return this;
    }

    public VacuumCleaner build() {
        return new VacuumCleaner(powerConsumption, filterType, bagType,
                wandType,motorSpeedRegulation, cleaningWidth);
    }
}
