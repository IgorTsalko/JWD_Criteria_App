package by.tc.task01.entity;

import java.util.Objects;

public class TabletPC extends Appliance{

    private final double BATTERY_CAPACITY;
    private final double DISPLAY_INCHES;
    private final double MEMORY_ROM;
    private final double FLASH_MEMORY_CAPACITY;
    private final String COLOR;

    public TabletPC(double batteryCapacity, double displayInches, double memoryRom,
                    double flashMemoryCapacity, String color) {
        this.BATTERY_CAPACITY = batteryCapacity;
        this.DISPLAY_INCHES = displayInches;
        this.MEMORY_ROM = memoryRom;
        this.FLASH_MEMORY_CAPACITY = flashMemoryCapacity;
        this.COLOR = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TabletPC tabletPC = (TabletPC) o;
        return Double.compare(tabletPC.BATTERY_CAPACITY, BATTERY_CAPACITY) == 0 &&
                Double.compare(tabletPC.DISPLAY_INCHES, DISPLAY_INCHES) == 0 &&
                Double.compare(tabletPC.MEMORY_ROM, MEMORY_ROM) == 0 &&
                Double.compare(tabletPC.FLASH_MEMORY_CAPACITY, FLASH_MEMORY_CAPACITY) == 0 &&
                COLOR.equals(tabletPC.COLOR);
    }

    @Override
    public int hashCode() {
        return Objects.hash(BATTERY_CAPACITY, DISPLAY_INCHES, MEMORY_ROM, FLASH_MEMORY_CAPACITY, COLOR);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "BATTERY_CAPACITY=" + BATTERY_CAPACITY +
                ", DISPLAY_INCHES=" + DISPLAY_INCHES +
                ", MEMORY_ROM=" + MEMORY_ROM +
                ", FLASH_MEMORY_CAPACITY=" + FLASH_MEMORY_CAPACITY +
                ", COLOR='" + COLOR + '\'' +
                '}';
    }
}
