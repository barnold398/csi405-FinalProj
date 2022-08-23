package edu.albany.csi405.finalproj.factory;

import edu.albany.csi405.finalproj.bot.*;

public class SoldierBotFactory implements AbstractBotFactory<SoldierBot> {
	
	public SoldierBot createBot(Purpose purpose) {
		SoldierBot bot = null;
		try {
			bot = new SoldierBot(purpose);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		return bot;
	}

}
