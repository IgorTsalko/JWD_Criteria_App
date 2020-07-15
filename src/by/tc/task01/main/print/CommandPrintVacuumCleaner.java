package by.tc.task01.main.print;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.VacuumCleaner;

public class CommandPrintVacuumCleaner extends CommandPrint {

    @Override
    public void execute(Appliance appliance) {
        VacuumCleaner vacuumCleaner = (VacuumCleaner) appliance;

        result.append(vacuumCleaner.getClass().getSimpleName())
                .append(" {")
                .append("POWER_CONSUMPTION=").append(decFormat.format(vacuumCleaner.getPOWER_CONSUMPTION()))
                .append("; FILTER_TYPE='").append(vacuumCleaner.getFILTER_TYPE()).append('\'')
                .append("; BAG_TYPE='").append(vacuumCleaner.getBAG_TYPE()).append('\'')
                .append("; WAND_TYPE='").append(vacuumCleaner.getWAND_TYPE()).append('\'')
                .append("; MOTOR_SPEED_REGULATION=").append(decFormat.format(vacuumCleaner.getMOTOR_SPEED_REGULATION()))
                .append("; CLEANING_WIDTH=").append(decFormat.format(vacuumCleaner.getCLEANING_WIDTH()))
                .append('}');

        System.out.println(result);
    }
}
