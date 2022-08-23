package edu.albany.csi405.finalproj.factory;

import edu.albany.csi405.finalproj.bot.Bot;
import edu.albany.csi405.finalproj.bot.Purpose;

public interface AbstractBotFactory<T extends Bot> {

	abstract public T createBot(Purpose purpose);
	
}
