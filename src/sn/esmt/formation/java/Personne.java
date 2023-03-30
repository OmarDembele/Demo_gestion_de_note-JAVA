package sn.esmt.formation.java;

import java.time.LocalDate;

public class Personne  {
	private String nom;
	private String prenom;
	private LocalDate dateBirth;
	private String placebirth;
	
	public Personne(String nom, String prenom,LocalDate dateBirth, String placeBirth) {
		this.setNom(nom);
		this.setPrenom(prenom);
		this.setDateBirth(dateBirth);
		this.setPlacebirth(placeBirth);
	}
	
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", dateBirth=" + dateBirth + ", placebirth=" + placebirth
				+ "]";
	}


	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public LocalDate getDateBirth() {
		return dateBirth;
	}

	public void setDateBirth(LocalDate dateBirth) {
		this.dateBirth = dateBirth;
	}

	public String getPlacebirth() {
		return placebirth;
	}

	public void setPlacebirth(String placebirth) {
		this.placebirth = placebirth;
	}
	
	
}

