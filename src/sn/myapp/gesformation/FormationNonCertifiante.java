package sn.myapp.gesformation;

public class FormationNonCertifiante extends Formation{
	private double exoneration;

	public void setExoneration(double exoneration) {
		if (exoneration >0 && exoneration <= 80)
			this.exoneration = getCout() - (getCout() * exoneration/100);
	}
	public double getExoneration() {
		return exoneration;
	}
	
	//constructeurs
	public FormationNonCertifiante(String libelle, double cout, double exoneration) {
		super(libelle, cout);
		setExoneration(exoneration);
	}
	
	
	@Override
	public String toString() {
		return "FormationNonCertifiante [exoneration=" + exoneration + ", toString()=" + super.toString() + "]";
	}
	public void afficher() {
		System.out.println(this);
	}
	
}
