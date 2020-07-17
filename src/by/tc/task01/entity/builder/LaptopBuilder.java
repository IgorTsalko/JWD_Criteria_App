package by.tc.task01.entity.builder;

import by.tc.task01.entity.Laptop;

public class LaptopBuilder {
    private double batteryCapacity;
    private String OS;
    private double memoryRom;
    private double systemMemory;
    private double CPU;
    private double displayInchs;

    public LaptopBuilder setBatteryCapacity(String batteryCapacity) {
        this.batteryCapacity = Double.parseDouble(batteryCapacity);
        return this;
    }

    public LaptopBuilder setOS(String OS) {
        this.OS = OS;
        return this;
    }

    public LaptopBuilder setMemoryRom(String memoryRom) {
        this.memoryRom = Double.parseDouble(memoryRom);
        return this;
    }

    public LaptopBuilder setSystemMemory(String systemMemory) {
        this.systemMemory = Double.parseDouble(systemMemory);
        return this;
    }

    public LaptopBuilder setCPU(String CPU) {
        this.CPU = Double.parseDouble(CPU);
        return this;
    }

    public LaptopBuilder setDisplayInchs(String displayInchs) {
        this.displayInchs = Double.parseDouble(displayInchs);
        return this;
    }

    public Laptop build() {
        return new Laptop(batteryCapacity, OS, memoryRom, systemMemory, CPU, displayInchs);
    }
}
