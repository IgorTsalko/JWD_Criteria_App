package by.tc.task01.main.print;

import by.tc.task01.entity.Appliance;

import java.text.DecimalFormat;

public abstract class CommandPrint {

    public StringBuilder result = new StringBuilder();
    public DecimalFormat decFormat = new DecimalFormat("###.##");

    public abstract void execute(Appliance appliance);
}
