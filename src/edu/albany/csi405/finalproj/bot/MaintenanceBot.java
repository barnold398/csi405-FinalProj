package edu.albany.csi405.finalproj.bot;
import edu.albany.csi405.finalproj.bot.kit.*;

public class MaintenanceBot extends Bot {

	private Toolkit toolkit;
	
	public MaintenanceBot(Purpose purpose) throws Exception {
		super();
		if (purpose == Purpose.SOLMACH || purpose == Purpose.SOLMINI || purpose == Purpose.SOLROCKET) {
			throw new Exception("Invalid purpose for this type of bot.");
		} else {
			this.purpose = purpose;
		}
		
		this.toolkit = new Toolkit(20);

	}
	
	public void use(String target) {
		if (purpose == Purpose.MAINTCLEAN) {
			System.out.println("Cleaning " + target + ".");
		} else if (purpose == Purpose.MAINTREP) {
			System.out.println("Reparing " + target + ".");
		}
		
		try {
			toolkit.use();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public void resupply() {toolkit.resupply();}
	
}
