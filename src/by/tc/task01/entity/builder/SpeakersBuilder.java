package by.tc.task01.entity.builder;

import by.tc.task01.entity.Speakers;

public class SpeakersBuilder {

    private double powerConsumption;
    private double numberOfSpeakers;
    private String frequencyRange;
    private double cordLength;

    public SpeakersBuilder setPowerConsumption(String powerConsumption) {
        this.powerConsumption = Double.parseDouble(powerConsumption);
        return this;
    }

    public SpeakersBuilder setNumberOfSpeakers(String numberOfSpeakers) {
        this.numberOfSpeakers = Double.parseDouble(numberOfSpeakers);
        return this;
    }

    public SpeakersBuilder setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
        return this;
    }

    public SpeakersBuilder setCordLength(String cordLength) {
        this.cordLength = Double.parseDouble(cordLength);
        return this;
    }

    public Speakers build() {
        return new Speakers(powerConsumption, numberOfSpeakers, frequencyRange, cordLength);
    }
}
