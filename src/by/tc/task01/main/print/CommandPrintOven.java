package by.tc.task01.main.print;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;

public class CommandPrintOven extends CommandPrint {

    @Override
    public void execute(Appliance appliance) {
        Oven oven = (Oven) appliance;

        result.append(oven.getClass().getSimpleName())
                .append(" {")
                .append("POWER_CONSUMPTION=").append(decFormat.format(oven.getPOWER_CONSUMPTION()))
                .append("; WEIGHT=").append(decFormat.format(oven.getWEIGHT()))
                .append("; CAPACITY=").append(decFormat.format(oven.getCAPACITY()))
                .append("; DEPTH=").append(decFormat.format(oven.getDEPTH()))
                .append("; HEIGHT=").append(decFormat.format(oven.getHEIGHT()))
                .append("; WIDTH=").append(decFormat.format(oven.getWIDTH()))
                .append('}');

        System.out.println(result);
    }
}
