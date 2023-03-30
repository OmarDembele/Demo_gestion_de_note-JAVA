package sn.esmt.formation.java;

public class Certificat {
	private String reference;
	private int dureeValidite;
	
	public Certificat(String reference, int dureeValidite) {
		this.reference = reference;
		this.dureeValidite = dureeValidite;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public int getDureeValidite() {
		return dureeValidite;
	}

	public void setDureeValidite(int dureeValidite) {
		if (dureeValidite>0)
		this.dureeValidite = dureeValidite;
	}
	
	
}
