package sn.esmt.formation.java;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Formation {
	private static int nbreFormation;
	
	protected int reference;
	protected String libelle;
	protected double cout;
	protected LocalDate debut;
	protected Personne formateur;
	protected int duree;
	
	//Formateur formateurs = new Formateur("NDIAYE" , "Abibou", "JAVA");
	//Date date = new Date();
	SimpleDateFormat dateFormat= new SimpleDateFormat();	
	
	public Formation(String libelle,double cout) { 
		this.setLibelle(libelle); 
		this.setCout(cout); 
		this.reference=++nbreFormation;
	}
	
	public String getLibelle() {
		return libelle;
	} 

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public double getCout() {
		return cout;
	}

	public void setCout(double cout) {
		if (cout >0)
		this.cout = cout;
	}

	public int getReference() {
		return reference;
	}
	
	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		if (duree>0)
		this.duree = duree;
	}

	public LocalDate getDebut() {
		return debut;
	}

	public void setDebut(LocalDate debut) {
		this.debut = debut;
	}

	public Personne getFormateur() {
		return formateur;
	}

	public void setFormateur(Personne formateur) {
		this.formateur = formateur;
	}

	public SimpleDateFormat getDateFormat() {
		return dateFormat;
	}

	public void setDateFormat(SimpleDateFormat dateFormat) {
		this.dateFormat = dateFormat;
	}

	@Override
	public String toString() {
		return "Formation [reference=" + reference + ", libelle=" + libelle + ", cout=" + cout + ", debut=" + debut
				+ ", formateur=" + formateur + ", duree=" + duree + ", dateFormat=" + dateFormat + "]";
	}
	
	public void afficher() {
		System.out.println(this);

	}
}
