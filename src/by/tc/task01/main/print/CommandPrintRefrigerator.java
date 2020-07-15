package by.tc.task01.main.print;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Refrigerator;

public class CommandPrintRefrigerator extends CommandPrint {

    @Override
    public void execute(Appliance appliance) {
        Refrigerator refrigerator = (Refrigerator) appliance;

        result.append(refrigerator.getClass().getSimpleName())
                .append(" {")
                .append("POWER_CONSUMPTION=").append(decFormat.format(refrigerator.getPOWER_CONSUMPTION()))
                .append("; WEIGHT=").append(decFormat.format(refrigerator.getWEIGHT()))
                .append("; FREEZER_CAPACITY=").append(decFormat.format(refrigerator.getFREEZER_CAPACITY()))
                .append("; OVERALL_CAPACITY=").append(decFormat.format(refrigerator.getOVERALL_CAPACITY()))
                .append("; HEIGHT=").append(decFormat.format(refrigerator.getHEIGHT()))
                .append("; WIDTH=").append(decFormat.format(refrigerator.getWIDTH()))
                .append('}');

        System.out.println(result);
    }
}
