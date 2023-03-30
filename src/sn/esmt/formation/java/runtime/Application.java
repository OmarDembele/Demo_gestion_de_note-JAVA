package sn.esmt.formation.java.runtime;

import java.time.LocalDate;

import sn.esmt.formation.java.Certifiante;
import sn.esmt.formation.java.Certificat;
import sn.esmt.formation.java.NonCertifiante;
import sn.esmt.formation.java.Personne;

public class Application {
	public static void main(String [] args) {
		 Personne formateur = new Personne("Safietou", "TITILOKPE BADJI", LocalDate.of(2007, 4, 26), "Dakar");
	        Personne formateur1 = new Personne("Richard", "MEDENOU", LocalDate.of(2005, 4, 3), "Quelque part");
	        Personne formateur2 = new Personne("Ida", "ABDOURAHAMANE", LocalDate.of(2002, 5, 5), "Ouganda");

	        Certificat rienDuTout = new Certificat("rdt01", 2000);
	        Certificat dormir = new Certificat("dmr01", 10);

	        Certifiante fc1 = new Certifiante("rien du tout", 1000000000, rienDuTout);
	        fc1.setFormateur(formateur1);
	        fc1.setDuree(15);
	        fc1.setDebut(LocalDate.now());
	        fc1.afficher();

	        Certifiante fc2 = new Certifiante("dormir", 1000000000, dormir);
	        fc2.setFormateur(formateur);
	        fc2.setDuree(25);
	        fc2.setDebut(LocalDate.of(2022, 12, 17));
	        fc2.afficher();

	        NonCertifiante fnc1 = new NonCertifiante("marcher", 1500, 25);
	        fnc1.setFormateur(formateur2);
	        fnc1.setDuree(5);
	        fnc1.setDebut(LocalDate.of(2022, 12, 23));
	        fnc1.afficher();
	
	
	}
	
}
