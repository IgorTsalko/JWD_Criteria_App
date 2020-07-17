package by.tc.task01.entity.builder;

import by.tc.task01.entity.Refrigerator;

public class RefrigeratorBuilder {

    private double powerConsumption;
    private double weight;
    private double freezerCapacity;
    private double overallCapacity;
    private double height;
    private double width;

    public RefrigeratorBuilder setPowerConsumption(String powerConsumption) {
        this.powerConsumption = Double.parseDouble(powerConsumption);
        return this;
    }

    public RefrigeratorBuilder setWeight(String weight) {
        this.weight = Double.parseDouble(weight);
        return this;
    }

    public RefrigeratorBuilder setFreezerCapacity(String freezerCapacity) {
        this.freezerCapacity = Double.parseDouble(freezerCapacity);
        return this;
    }

    public RefrigeratorBuilder setOverallCapacity(String overallCapacity) {
        this.overallCapacity = Double.parseDouble(overallCapacity);
        return this;
    }

    public RefrigeratorBuilder setHeight(String height) {
        this.height = Double.parseDouble(height);
        return this;
    }

    public RefrigeratorBuilder setWidth(String width) {
        this.width = Double.parseDouble(width);
        return this;
    }

    public Refrigerator build() {
        return new Refrigerator(powerConsumption, weight,freezerCapacity,overallCapacity, height, width);
    }
}
