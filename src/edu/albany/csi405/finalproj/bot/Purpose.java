package edu.albany.csi405.finalproj.bot;

public enum Purpose {
	
	SOLMINI("Minigun Soldier Bot"), SOLMACH("Machine Gun Soldier Bot"), SOLROCKET("Rocket Soldier Bot"),
	MAINTREP("Repair Bot"), MAINTCLEAN("Cleaner Bot");
	
	private String purpose;
	
	private Purpose(String purpose) {this.purpose = purpose;}
	
	public String getPurpose() {return this.purpose;}
	
}
