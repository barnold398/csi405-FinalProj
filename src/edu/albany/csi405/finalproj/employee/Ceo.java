package edu.albany.csi405.finalproj.employee;

public class Ceo extends Employee<Integer> {

	private static Ceo ceo = null;
	
	private Ceo() {
		super("Loki", 1_000_000);
	}
	
	public static Ceo getInstance() {
		if (ceo == null)
			ceo = new Ceo();
		
		return ceo;
	}
}
