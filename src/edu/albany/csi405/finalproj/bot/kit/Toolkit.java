package edu.albany.csi405.finalproj.bot.kit;

public class Toolkit {

	private int uses;
	private int maxuses;
	
	public Toolkit(int maxuses) {
		this.maxuses = maxuses;
		this.uses = maxuses;
	}
	
	public void use() throws Exception {
		if (uses <= 0) {
			throw new Exception("Out of supplies!");
		} else {
			uses--;
			System.out.println(uses + " uses remaining.");
		}
	}
	
	public void resupply() {
		uses = maxuses;
		System.out.println("Resupplied, " + uses + " uses remaining.");
	}
	
}
