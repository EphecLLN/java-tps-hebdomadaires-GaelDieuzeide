package Ecole;

import java.time.LocalDate;

public class Ecole {
	public static void main(String[] args){
		Etu toto = new Etu();
		toto.setNom("Hazard");
		toto.setPrenom("Eden");
		toto.setDateNaissance(LocalDate.of(2000, 10, 10));
		try {
			toto.setDateArrivee(LocalDate.of(2001, 1, 1));
		}
		catch(DateArriveeInvalideException e) {
			e.printStackTrace();
		}
		System.out.println(toto);
	}
}
