package by.tc.task01.main.print;

import by.tc.task01.entity.Appliance;

public class CommandPrintNotFound extends CommandPrint {

    @Override
    public void execute(Appliance appliance) {
        System.out.println("I don't know anything about this appliance!");
    }
}
