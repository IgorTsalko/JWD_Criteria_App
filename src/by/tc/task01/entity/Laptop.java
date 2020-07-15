package by.tc.task01.entity;

import java.util.Objects;

public class Laptop extends Appliance{

    private final double BATTERY_CAPACITY;
    private final String OS;
    private final double MEMORY_ROM;
    private final double SYSTEM_MEMORY;
    private final double CPU;
    private final double DISPLAY_INCHS;

    public Laptop(double batteryCapacity, String OS, double memoryRom,
                  double systemMemory, double CPU, double displayInchs) {
        this.BATTERY_CAPACITY = batteryCapacity;
        this.OS = OS;
        this.MEMORY_ROM = memoryRom;
        this.SYSTEM_MEMORY = systemMemory;
        this.CPU = CPU;
        this.DISPLAY_INCHS = displayInchs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return Double.compare(laptop.BATTERY_CAPACITY, BATTERY_CAPACITY) == 0 &&
                Double.compare(laptop.MEMORY_ROM, MEMORY_ROM) == 0 &&
                Double.compare(laptop.SYSTEM_MEMORY, SYSTEM_MEMORY) == 0 &&
                Double.compare(laptop.CPU, CPU) == 0 &&
                Double.compare(laptop.DISPLAY_INCHS, DISPLAY_INCHS) == 0 &&
                OS.equals(laptop.OS);
    }

    @Override
    public int hashCode() {
        return Objects.hash(BATTERY_CAPACITY, OS, MEMORY_ROM, SYSTEM_MEMORY, CPU, DISPLAY_INCHS);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "BATTERY_CAPACITY=" + BATTERY_CAPACITY +
                ", OS='" + OS + '\'' +
                ", MEMORY_ROM=" + MEMORY_ROM +
                ", SYSTEM_MEMORY=" + SYSTEM_MEMORY +
                ", CPU=" + CPU +
                ", DISPLAY_INCHS=" + DISPLAY_INCHS +
                '}';
    }
}
