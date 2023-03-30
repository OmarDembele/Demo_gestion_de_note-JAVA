package sn.myapp.gesformation;

public class Formation {
	private int reference;
	private String libelle;
	private String dateDeDebut;
	private Personne formateur;
	private double cout;
	private static int nbFormation;
		
	//setters
	public void setLibele(String libelle) {
		this.libelle = libelle;
	}
	public void setDateDeDebut(String dateDeDebut) {
		this.dateDeDebut = dateDeDebut;
	}
	public void setFormateur(Personne formateur) {
		this.formateur = formateur;
	}
	public void setCout(double cout) {
		if(cout>0)
			this.cout = cout;
	}
	
	//getters
	public int getReference() {
		return reference;
	}
	public String getLibele() {
		return libelle;
	}
	public String getDateDeDebut() {
		return dateDeDebut;
	}
	public Personne getFormateur() {
		return formateur;
	}
	public double getCout() {
		return cout;
	}
	public static int getNbFormation() {
		return nbFormation;
	}
		
	//constructeurs
	public Formation() {
		nbFormation++;
		reference = nbFormation;
	}
	public Formation(String libelle, double cout) {
		this();
		this.libelle = libelle;
		this.cout = cout;
	}
	
	
	@Override
	public String toString() {
		return "Formation [reference=" + reference + ", libelle=" + libelle + ", dateDeDebut=" + dateDeDebut
				+ ", formateur=" + formateur + ", cout=" + cout + "]";
	}
	public void afficher() {
		System.out.println(this);
	}

}
