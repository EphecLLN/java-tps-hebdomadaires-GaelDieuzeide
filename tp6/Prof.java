package Ecole;

import java.time.LocalDate;
import java.time.Month;


public class Prof extends Personne{
	/*
	 * This constructor uses the basic constructor of the class Personne
	 */
	public Prof() {
		super();
	}
	/*
	 * this constructor creates a prof based on the person class using his name, forename, Date of Birth and aarrival Date
	 */
	public Prof(String nom, String prenom, LocalDate dateNaissance, LocalDate dateArrivee) {
		super();
	}
	/*
	 * This method gives a textual representation of the prof
	 */
	@Override
	public String toString() {
		return (super.toString());
	}
	/*
	 * This method calculates the seniority of the prof
	 */
	public String anciennete() {
		if ((super.getDateArrivee().getYear()-super.getDateNaissance().getYear())>23) {
			return ("L'ancienneté du professeur vaut: "+(LocalDate.now().getYear()-super.getDateArrivee().getYear()));
		} else {
			if (super.age()<23) {
				return ("Le professeur n'a pas encore atteint l'âge requit pour pouvoir évaluer son ancienneté.");
			} else {
				return ("L'ancienneté du professeur vaut: "+((LocalDate.now().getYear()-super.getDateArrivee().getYear())-(23-super.age(super.getDateArrivee()))));
			}
		}
	}
	/*
	 * this method creates a professor
	 */
	public static void main(String[] args) {
		Prof toto = new Prof("bruce", "Wayne",LocalDate.of(1998, Month.DECEMBER, 24),LocalDate.of(2016, Month.SEPTEMBER, 9));
		
		System.out.println(toto);
		System.out.println(toto.anciennete());
	}
}
	
