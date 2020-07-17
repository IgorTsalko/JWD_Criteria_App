package by.tc.task01.entity.builder;

import by.tc.task01.entity.TabletPC;

public class TabletPCBuilder {

    private double batteryCapacity;
    private double displayInches;
    private double memoryRom;
    private double flashMemoryCapacity;
    private String color;

    public TabletPCBuilder setBatteryCapacity(String batteryCapacity) {
        this.batteryCapacity = Double.parseDouble(batteryCapacity);
        return this;
    }

    public TabletPCBuilder setDisplayInches(String displayInches) {
        this.displayInches = Double.parseDouble(displayInches);
        return this;
    }

    public TabletPCBuilder setMemoryRom(String memoryRom) {
        this.memoryRom = Double.parseDouble(memoryRom);
        return this;
    }

    public TabletPCBuilder setFlashMemoryCapacity(String flashMemoryCapacity) {
        this.flashMemoryCapacity = Double.parseDouble(flashMemoryCapacity);
        return this;
    }

    public TabletPCBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public TabletPC build() {
        return new TabletPC(batteryCapacity, displayInches, memoryRom, flashMemoryCapacity, color);
    }
}
