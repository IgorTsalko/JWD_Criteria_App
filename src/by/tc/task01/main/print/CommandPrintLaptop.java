package by.tc.task01.main.print;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;

public class CommandPrintLaptop extends CommandPrint {

    @Override
    public void execute(Appliance appliance) {
        Laptop laptop = (Laptop) appliance;

        result.append(laptop.getClass().getSimpleName())
                .append(" {")
                .append("BATTERY_CAPACITY=").append(decFormat.format(laptop.getBATTERY_CAPACITY()))
                .append("; OS='").append(laptop.getOS()).append('\'')
                .append("; MEMORY_ROM=").append(decFormat.format(laptop.getMEMORY_ROM()))
                .append("; SYSTEM_MEMORY=").append(decFormat.format(laptop.getSYSTEM_MEMORY()))
                .append("; CPU=").append(decFormat.format(laptop.getCPU()))
                .append("; DISPLAY_INCHS=").append(decFormat.format(laptop.getDISPLAY_INCHS()))
                .append('}');

        System.out.println(result);
    }
}
