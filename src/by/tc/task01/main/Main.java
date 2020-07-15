package by.tc.task01.main;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.main.print.PrintApplianceInfo;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;
import by.tc.task01.service.exception.ServiceException;

import java.util.List;

public class Main {

    public static void main(String[] args) throws ServiceException {
        List<Appliance> appliances;

        ServiceFactory factory = ServiceFactory.getInstance();
        ApplianceService service = factory.getApplianceService();

        //////////////////////////////////////////////////////////////////

        Criteria criteriaOven = new Criteria(Oven.class.getSimpleName()); // "Oven"
        criteriaOven.add(Oven.CAPACITY.toString(), 32);

        appliances = service.find(criteriaOven);

        PrintApplianceInfo.print(appliances);

        //////////////////////////////////////////////////////////////////

        Criteria criteriaVacuumCleaner = new Criteria(VacuumCleaner.class.getSimpleName());
        criteriaVacuumCleaner.add(VacuumCleaner.FILTER_TYPE.toString(), "A");
        criteriaVacuumCleaner.add(VacuumCleaner.BAG_TYPE.toString(), "A2");

        appliances = service.find(criteriaVacuumCleaner);

        PrintApplianceInfo.print(appliances);

        //////////////////////////////////////////////////////////////////

        Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
        criteriaTabletPC.add(TabletPC.COLOR.toString(), "BLUE");
        criteriaTabletPC.add(TabletPC.DISPLAY_INCHES.toString(), 14);
        criteriaTabletPC.add(TabletPC.MEMORY_ROM.toString(), 8000);

        appliances = service.find(criteriaTabletPC);

        PrintApplianceInfo.print(appliances);

        //////////////////////////////////////////////////////////////////

        Criteria criteriaRefrigerator = new Criteria(Refrigerator.class.getSimpleName());
        criteriaRefrigerator.add(Refrigerator.OVERALL_CAPACITY.toString(), 350.5);
        criteriaRefrigerator.add(Refrigerator.POWER_CONSUMPTION.toString(), 150);

        appliances = service.find(criteriaRefrigerator);

        PrintApplianceInfo.print(appliances);

        //////////////////////////////////////////////////////////////////

        Criteria criteriaLaptop = new Criteria(Laptop.class.getSimpleName());
        criteriaLaptop.add(Laptop.OS.toString(), "Windows");

        appliances = service.find(criteriaLaptop);

        PrintApplianceInfo.print(appliances);

        //////////////////////////////////////////////////////////////////

        Criteria criteriaSpeakers = new Criteria(Speakers.class.getSimpleName());
        criteriaSpeakers.add(Speakers.FREQUENCY_RANGE.toString(), "2-4");

        appliances = service.find(criteriaSpeakers);

        PrintApplianceInfo.print(appliances);

    }

}
