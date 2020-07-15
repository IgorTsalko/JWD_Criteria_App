package by.tc.task01.main.print;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Speakers;

public class CommandPrintSpeakers extends CommandPrint {

    @Override
    public void execute(Appliance appliance) {
        Speakers speakers = (Speakers) appliance;

        result.append(speakers.getClass().getSimpleName())
                .append(" {")
                .append("POWER_CONSUMPTION=").append(decFormat.format(speakers.getPOWER_CONSUMPTION()))
                .append("; NUMBER_OF_SPEAKERS=").append(decFormat.format(speakers.getNUMBER_OF_SPEAKERS()))
                .append("; FREQUENCY_RANGE='").append(speakers.getFREQUENCY_RANGE()).append('\'')
                .append("; CORD_LENGTH=").append(decFormat.format(speakers.getCORD_LENGTH()))
                .append('}');

        System.out.println(result);
    }
}
