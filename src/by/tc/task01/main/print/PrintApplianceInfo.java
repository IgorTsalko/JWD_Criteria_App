package by.tc.task01.main.print;

import by.tc.task01.entity.*;

import java.util.List;

public class PrintApplianceInfo {

    public static void print(List<Appliance> appliances) {
        if (appliances != null && appliances.size() > 0) {
            CommandPrint commandPrint;

            for (Appliance appliance : appliances) {
                if (appliance instanceof Laptop) {
                    commandPrint = new CommandPrintLaptop();
                } else if (appliance instanceof Oven) {
                    commandPrint = new CommandPrintOven();
                } else if (appliance instanceof Refrigerator) {
                    commandPrint = new CommandPrintRefrigerator();
                } else if (appliance instanceof Speakers) {
                    commandPrint = new CommandPrintSpeakers();
                } else if (appliance instanceof TabletPC) {
                    commandPrint = new CommandPrintTabletPC();
                } else if (appliance instanceof VacuumCleaner) {
                    commandPrint = new CommandPrintVacuumCleaner();
                } else {
                    commandPrint = new CommandPrintNotFound();
                }

                commandPrint.execute(appliance);
            }

            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        }
    }

}
