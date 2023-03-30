package sn.myapp.gesformation;

public class FormationCerfiante extends Formation {
	private String referenceDeCertification;
	private int dureDeValidite;
	
	//getters and setters
	public String getReferenceDeCertification() {
		return referenceDeCertification;
	}
	public void setReferenceDeCertification(String referenceDeCertification) {
		this.referenceDeCertification = referenceDeCertification;
	}
	public int getDureDeValidite() {
		return dureDeValidite;
	}
	public void setDureDeValidite(int dureDeValidite) {
		this.dureDeValidite = dureDeValidite;
	}
	
	//constructeur
	public FormationCerfiante(String libelle, double cout, String referenceDeCertification) {
		super(libelle, cout);
		this.referenceDeCertification = referenceDeCertification;
		
	}
	
	@Override
	public String toString() {
		return "FormationCerfiante [referenceDeCertification=" + referenceDeCertification + ", dureDeValidite="
				+ dureDeValidite + ", toString()=" + super.toString() + "]";
	}
	//methode afficher
	public void afficher() {
		System.out.println(this);
	}
	
	
	

}
