package by.tc.task01.entity;

import java.util.Objects;

public class Refrigerator implements Appliance{

    private final double POWER_CONSUMPTION;
    private final double WEIGHT;
    private final double FREEZER_CAPACITY;
    private final double OVERALL_CAPACITY;
    private final double HEIGHT;
    private final double WIDTH;

    public Refrigerator(double powerConsumption, double weight, double freezerCapacity,
                        double overallCapacity, double height, double width) {
        this.POWER_CONSUMPTION = powerConsumption;
        this.WEIGHT = weight;
        this.FREEZER_CAPACITY = freezerCapacity;
        this.OVERALL_CAPACITY = overallCapacity;
        this.HEIGHT = height;
        this.WIDTH = width;
    }

    public double getPOWER_CONSUMPTION() {
        return POWER_CONSUMPTION;
    }

    public double getWEIGHT() {
        return WEIGHT;
    }

    public double getFREEZER_CAPACITY() {
        return FREEZER_CAPACITY;
    }

    public double getOVERALL_CAPACITY() {
        return OVERALL_CAPACITY;
    }

    public double getHEIGHT() {
        return HEIGHT;
    }

    public double getWIDTH() {
        return WIDTH;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Refrigerator that = (Refrigerator) o;
        return Double.compare(that.POWER_CONSUMPTION, POWER_CONSUMPTION) == 0 &&
                Double.compare(that.WEIGHT, WEIGHT) == 0 &&
                Double.compare(that.FREEZER_CAPACITY, FREEZER_CAPACITY) == 0 &&
                Double.compare(that.OVERALL_CAPACITY, OVERALL_CAPACITY) == 0 &&
                Double.compare(that.HEIGHT, HEIGHT) == 0 &&
                Double.compare(that.WIDTH, WIDTH) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(POWER_CONSUMPTION, WEIGHT, FREEZER_CAPACITY, OVERALL_CAPACITY, HEIGHT, WIDTH);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "POWER_CONSUMPTION=" + POWER_CONSUMPTION +
                ", WEIGHT=" + WEIGHT +
                ", FREEZER_CAPACITY=" + FREEZER_CAPACITY +
                ", OVERALL_CAPACITY=" + OVERALL_CAPACITY +
                ", HEIGHT=" + HEIGHT +
                ", WIDTH=" + WIDTH +
                '}';
    }
}
