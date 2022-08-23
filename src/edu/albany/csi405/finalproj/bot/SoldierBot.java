package edu.albany.csi405.finalproj.bot;
import edu.albany.csi405.finalproj.bot.kit.*;

public class SoldierBot extends Bot {

	private Weapon weapon;
	
	public SoldierBot(Purpose purpose) throws Exception {
		super();
		if (purpose == Purpose.MAINTCLEAN || purpose == Purpose.MAINTREP) {
			throw new Exception("Invalid purpose for this type of bot.");
		} else {
			this.purpose = purpose;
		}
		
		weapon = new Weapon(20);
		
	}
	
	public void attack(String target) {
		System.out.println("Attacking " + target + "!");
		try {
			weapon.fire();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void defend(String target) {
		System.out.println("Defending " + target + ".");
	}
	
	public void reload() {weapon.reload();}
	
}
