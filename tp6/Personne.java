package Ecole;


import java.time.LocalDate;

/**
 * 
 * This class represents a person
 * @author Gaël
 *
 */
public abstract class Personne {
		/*
		 * the name of the person
		 */
		protected String nom;
		/*
		 * the forename of the person
		 */
		protected String prenom;
		/*
		 * either the birthday year or the year of entry
		 */
		protected LocalDate dateNaissance;
		/*
		 * the date of entry
		 */
		protected LocalDate dateArrivee;
		
		/*
		 * This constructor allows the user to create teacher from scratch
		 */
	public Personne() {
		
	}
	/*
	 * This constructor allows the user to create teacher 
	 */
	
	/*
	 * this method gives the name of the person
	 */
	public String getNom() {
		return nom;
	}
	/*
	 * this method allows the user to set the name of the person
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/*
	 * this method gives the forename of the person
	 */
	public String getPrenom() {
		return prenom;
	}
	/*
	 *  this method allows the user to set the forename of the person
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/*
	 * this method gives the birthday of the person
	 */
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}
	/*
	 *  this method allows the user to set the birthday of the person
	 */
	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	/*
	 * this method gives the date of entry of the person
	 */
	public LocalDate getDateArrivee() {
		return dateArrivee;
	}
	/*
	 *  this method allows the user to set the date of entry and if it's not good it send a message back
	 */
	public void setDateArrivee(LocalDate dateArrivee) throws DateArriveeInvalideException {
		this.dateArrivee = dateArrivee;
	}
	/*
	 * This method gives a textual representation of the person
	 */
	public String toString() {
		return ("Nom: " + this.nom + " Prénom: " + this.prenom + "\nAge: " + this.age());
	}
	/*
	 * this method gives the age of the person based on his birthday and on the current date
	 * @return an int representing the age of the person now
	 */
	public int age() {
		return this.dateNaissance.until(LocalDate.now()).getYears();
	}
	/*
	 * this method gives the age of the person from a specific date 
	 * @param i the specific date 
	 * @return int representing the age of the person
	 */
	public int age(LocalDate i) {
		return (i.getYear()-dateNaissance.getYear());
	}
	
}
