package by.tc.task01.entity.builder;

import by.tc.task01.entity.Oven;

public class OvenBuilder {
    private double powerConsumption;
    private double weight;
    private double capacity;
    private double depth;
    private double height;
    private double width;

    public OvenBuilder setPowerConsumption(String powerConsumption) {
        this.powerConsumption = Double.parseDouble(powerConsumption);
        return this;
    }

    public OvenBuilder setWeight(String weight) {
        this.weight = Double.parseDouble(weight);
        return this;
    }

    public OvenBuilder setCapacity(String capacity) {
        this.capacity = Double.parseDouble(capacity);
        return this;
    }

    public OvenBuilder setDepth(String depth) {
        this.depth = Double.parseDouble(depth);
        return this;
    }

    public OvenBuilder setHeight(String height) {
        this.height = Double.parseDouble(height);
        return this;
    }

    public OvenBuilder setWidth(String width) {
        this.width = Double.parseDouble(width);
        return this;
    }

    public Oven build() {
        return new Oven(powerConsumption, weight, capacity, depth, height, width);
    }
}
