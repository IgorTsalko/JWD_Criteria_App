package by.tc.task01.entity;

import java.util.Objects;

public class Speakers implements Appliance{

    private final double POWER_CONSUMPTION;
    private final double NUMBER_OF_SPEAKERS;
    private final String FREQUENCY_RANGE;
    private final double CORD_LENGTH;

    public Speakers(double powerConsumption, double numberOfSpeakers, String frequencyRange, double cordLength) {
        this.POWER_CONSUMPTION = powerConsumption;
        this.NUMBER_OF_SPEAKERS = numberOfSpeakers;
        this.FREQUENCY_RANGE = frequencyRange;
        this.CORD_LENGTH = cordLength;
    }

    public double getPOWER_CONSUMPTION() {
        return POWER_CONSUMPTION;
    }

    public double getNUMBER_OF_SPEAKERS() {
        return NUMBER_OF_SPEAKERS;
    }

    public String getFREQUENCY_RANGE() {
        return FREQUENCY_RANGE;
    }

    public double getCORD_LENGTH() {
        return CORD_LENGTH;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Speakers speakers = (Speakers) o;
        return Double.compare(speakers.POWER_CONSUMPTION, POWER_CONSUMPTION) == 0 &&
                Double.compare(speakers.NUMBER_OF_SPEAKERS, NUMBER_OF_SPEAKERS) == 0 &&
                Double.compare(speakers.CORD_LENGTH, CORD_LENGTH) == 0 &&
                FREQUENCY_RANGE.equals(speakers.FREQUENCY_RANGE);
    }

    @Override
    public int hashCode() {
        return Objects.hash(POWER_CONSUMPTION, NUMBER_OF_SPEAKERS, FREQUENCY_RANGE, CORD_LENGTH);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "POWER_CONSUMPTION=" + POWER_CONSUMPTION +
                ", NUMBER_OF_SPEAKERS=" + NUMBER_OF_SPEAKERS +
                ", FREQUENCY_RANGE=" + FREQUENCY_RANGE +
                ", CORD_LENGTH=" + CORD_LENGTH +
                '}';
    }
}
