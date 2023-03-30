package sn.myapp.gesformation.runtime;

import sn.myapp.gesformation.*;

public class Application {

	public static void main(String[] args) {
		Formation forma1 = new FormationCerfiante("LTI", 1_255_000, "Af575");
		Formation forma2 = new FormationCerfiante("INGC", 2_000_000, "Af584");
		Formation forma3 = new FormationNonCertifiante("LPMEN", 1_255_000, 70);
		
		Personne personne1 = new Personne("SOW", "Moussa", 32);
		Personne personne2 = new Personne("loum", "Moussa", 30);
		Personne personne3 = new Personne("toure", "baba", 35);
		
		forma1.setFormateur(personne1);
		forma2.setFormateur(personne2);
		forma3.setFormateur(personne3);
		forma1.setDateDeDebut("22-20-2022");
		forma2.setDateDeDebut("15-20-2022");
		forma3.setDateDeDebut("18-20-2022");
		
		forma1.afficher();
		forma2.afficher();
		forma3.afficher();
		
		
	}

}
