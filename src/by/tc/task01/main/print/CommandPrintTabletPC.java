package by.tc.task01.main.print;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.TabletPC;

public class CommandPrintTabletPC extends CommandPrint {

    @Override
    public void execute(Appliance appliance) {
        TabletPC tabletPC = (TabletPC) appliance;

        result.append(tabletPC.getClass().getSimpleName())
                .append(" {")
                .append("BATTERY_CAPACITY=").append(decFormat.format(tabletPC.getBATTERY_CAPACITY()))
                .append("; DISPLAY_INCHES=").append(decFormat.format(tabletPC.getDISPLAY_INCHES()))
                .append("; MEMORY_ROM=").append(decFormat.format(tabletPC.getMEMORY_ROM()))
                .append("; FLASH_MEMORY_CAPACITY=").append(decFormat.format(tabletPC.getFLASH_MEMORY_CAPACITY()))
                .append("; COLOR='").append(tabletPC.getCOLOR()).append('\'')
                .append('}');

        System.out.println(result);
    }
}
