package edu.albany.csi405.finalproj.factory;

import edu.albany.csi405.finalproj.bot.*;

public class MaintenanceBotFactory implements AbstractBotFactory<MaintenanceBot> {

	public MaintenanceBot createBot(Purpose purpose) {
		
		MaintenanceBot bot = null;
		try {
			bot = new MaintenanceBot(purpose);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		return bot;
	}
}
