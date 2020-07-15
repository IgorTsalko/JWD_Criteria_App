package by.tc.task01.entity;

import java.util.Objects;

public class VacuumCleaner implements Appliance{

    private final double POWER_CONSUMPTION;
    private final String FILTER_TYPE;
    private final String BAG_TYPE;
    private final String WAND_TYPE;
    private final double MOTOR_SPEED_REGULATION;
    private final double CLEANING_WIDTH;

    public VacuumCleaner(double powerConsumption, String filterType, String bagType,
                         String wandType, double motorSpeedRegulation, double cleaningWidth) {
        this.POWER_CONSUMPTION = powerConsumption;
        this.FILTER_TYPE = filterType;
        this.BAG_TYPE = bagType;
        this.WAND_TYPE = wandType;
        this.MOTOR_SPEED_REGULATION = motorSpeedRegulation;
        this.CLEANING_WIDTH = cleaningWidth;
    }

    public double getPOWER_CONSUMPTION() {
        return POWER_CONSUMPTION;
    }

    public String getFILTER_TYPE() {
        return FILTER_TYPE;
    }

    public String getBAG_TYPE() {
        return BAG_TYPE;
    }

    public String getWAND_TYPE() {
        return WAND_TYPE;
    }

    public double getMOTOR_SPEED_REGULATION() {
        return MOTOR_SPEED_REGULATION;
    }

    public double getCLEANING_WIDTH() {
        return CLEANING_WIDTH;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VacuumCleaner that = (VacuumCleaner) o;
        return Double.compare(that.POWER_CONSUMPTION, POWER_CONSUMPTION) == 0 &&
                Double.compare(that.MOTOR_SPEED_REGULATION, MOTOR_SPEED_REGULATION) == 0 &&
                Double.compare(that.CLEANING_WIDTH, CLEANING_WIDTH) == 0 &&
                FILTER_TYPE.equals(that.FILTER_TYPE) &&
                BAG_TYPE.equals(that.BAG_TYPE) &&
                WAND_TYPE.equals(that.WAND_TYPE);
    }

    @Override
    public int hashCode() {
        return Objects.hash(POWER_CONSUMPTION, FILTER_TYPE, BAG_TYPE, WAND_TYPE, MOTOR_SPEED_REGULATION, CLEANING_WIDTH);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "POWER_CONSUMPTION=" + POWER_CONSUMPTION +
                ", FILTER_TYPE=" + FILTER_TYPE +
                ", BAG_TYPE=" + BAG_TYPE +
                ", WAND_TYPE=" + WAND_TYPE +
                ", MOTOR_SPEED_REGULATION=" + MOTOR_SPEED_REGULATION +
                ", CLEANING_WIDTH=" + CLEANING_WIDTH +
                '}';
    }
}
