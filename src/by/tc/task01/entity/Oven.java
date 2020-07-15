package by.tc.task01.entity;

import java.util.Objects;

public class Oven extends Appliance {

    private final double POWER_CONSUMPTION;
    private final double WEIGHT;
    private final double CAPACITY;
    private final double DEPTH;
    private final double HEIGHT;
    private final double WIDTH;

    public Oven(double powerConsumption, double weight, double capacity,
                double depth, double height, double width) {
        this.POWER_CONSUMPTION = powerConsumption;
        this.WEIGHT = weight;
        this.CAPACITY = capacity;
        this.DEPTH = depth;
        this.HEIGHT = height;
        this.WIDTH = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Oven oven = (Oven) o;
        return Double.compare(oven.POWER_CONSUMPTION, POWER_CONSUMPTION) == 0 &&
                Double.compare(oven.WEIGHT, WEIGHT) == 0 &&
                Double.compare(oven.CAPACITY, CAPACITY) == 0 &&
                Double.compare(oven.DEPTH, DEPTH) == 0 &&
                Double.compare(oven.HEIGHT, HEIGHT) == 0 &&
                Double.compare(oven.WIDTH, WIDTH) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(POWER_CONSUMPTION, WEIGHT, CAPACITY, DEPTH, HEIGHT, WIDTH);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "POWER_CONSUMPTION=" + POWER_CONSUMPTION +
                ", WEIGHT=" + WEIGHT +
                ", CAPACITY=" + CAPACITY +
                ", DEPTH=" + DEPTH +
                ", HEIGHT=" + HEIGHT +
                ", WIDTH=" + WIDTH +
                '}';
    }
}
