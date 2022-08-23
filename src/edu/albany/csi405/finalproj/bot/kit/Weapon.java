package edu.albany.csi405.finalproj.bot.kit;

public class Weapon {

	private int ammo;
	private int maxammo;
	
	public Weapon(int maxammo) {
		this.maxammo = maxammo;
		this.ammo = maxammo;
	}
	
	public void fire() throws Exception {
		if (ammo <= 0) {
			throw new Exception("Out of ammo!");
		} else {
			System.out.println("Firing weapon!");
			ammo--;
			System.out.println(ammo + " rounds remaining.");
		}
	}
	
	public void reload() {
		ammo = maxammo;
		System.out.println("Reloaded, " + maxammo + " rounds remaining.");
	}
	
}
