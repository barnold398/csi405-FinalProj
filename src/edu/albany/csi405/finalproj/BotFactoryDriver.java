package edu.albany.csi405.finalproj;

import java.util.ArrayList;

import edu.albany.csi405.finalproj.bot.*;
import edu.albany.csi405.finalproj.employee.*;
import edu.albany.csi405.finalproj.factory.*;

public class BotFactoryDriver {

	
	public static void main(String[] args) {
		
		ArrayList<Employee<Integer>> empList = new ArrayList<>();
		empList.add(Ceo.getInstance());
		Technician bob = new Technician("Bob", 100_000);
		empList.add(bob);
		
		for (Employee<Integer> emp : empList) {
			emp.getPaid();
		}
		
		AbstractBotFactory<SoldierBot> soldierFactory = new SoldierBotFactory();
		AbstractBotFactory<MaintenanceBot> maintenanceFactory = new MaintenanceBotFactory();
		
		ArrayList<Bot> botList = new ArrayList<>();
		botList.add(soldierFactory.createBot(Purpose.SOLMINI));
		botList.add(soldierFactory.createBot(Purpose.SOLMACH));
		botList.add(soldierFactory.createBot(Purpose.SOLROCKET));
		botList.add(maintenanceFactory.createBot(Purpose.MAINTCLEAN));
		botList.add(maintenanceFactory.createBot(Purpose.MAINTREP));
		
		// Should be caught exception
		soldierFactory.createBot(Purpose.MAINTREP);
		
		for (Bot bot : botList) {
			System.out.println(bot.stateIdPurpose());
			
			if (bot instanceof SoldierBot) {
				SoldierBot soldier = (SoldierBot) bot;
				soldier.attack("Moscow");
				soldier.defend("Paris");
				soldier.reload();
			} else if (bot instanceof MaintenanceBot) {
				MaintenanceBot maintain = (MaintenanceBot) bot;
				maintain.use("pylon");
			}
		}
		
	}
}
