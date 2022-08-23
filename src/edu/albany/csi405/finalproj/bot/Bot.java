package edu.albany.csi405.finalproj.bot;

public abstract class Bot {

	static int count = 0;
	
	private int id;
	protected Purpose purpose;
	
	public String stateIdPurpose() {return "My ID number is " + id + " and I am a " + purpose.getPurpose() + ".";}

	public Bot() {
		this.id = count + 1;
		count++;
	}
}
