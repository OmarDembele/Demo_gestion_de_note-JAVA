package sn.esmt.formation.java;

public class Certifiante extends Formation{
	private Certificat certificat;
	
	public Certifiante(String libelle, double cout, Certificat certificat) {
		super(libelle, cout);
		this.setCertifat(certificat);
	}
	
	public Certificat getCertifat() {
		return certificat;
	}

	public void setCertifat(Certificat certifat) {
		this.certificat = certifat;
	}

	@Override
	public String toString() {
		return super.toString()+"Certifiante [Reference=" + certificat.getReference() + ", Duree de validite=" + certificat.getDureeValidite() + "]"; 
	}
	
	
}	
