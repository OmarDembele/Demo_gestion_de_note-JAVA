package sn.esmt.formation.java;

public class NonCertifiante extends Formation {
	private int exoneration;
	
	public NonCertifiante(String libelle, double cout, int exoneration) {
		super(libelle, cout);
		this.setExoneration(exoneration);
	}
	
	public double getCout() {
		return cout*(1-exoneration/100);
	}

	public void setCoutNonCertifiante(double coutNonCertifiante) {
			setCout(coutNonCertifiante*(1-0.2));
	}

	public int getExoneration() {
		return exoneration;
	}


	public void setExoneration(int exoneration) {
		if (exoneration >0 && exoneration<=0.8)
		this.exoneration = exoneration;
	}

	@Override
	public String toString() {
		return super.toString() +"FormationNonCertifiante [cout avec exoneration=" + exoneration + ", cout initial " +cout+"]";
	}
	
	
}
