package Ecole;
import java.time.LocalDate;
/**
 * this class represents a student
 * @author Gaël
 *
 */
public class Etu extends Personne {
	
	public Etu() {
		
	}
	/*
	 * the registration number of the student
	 */
	public String matricule() {
		return (getNom().charAt(0)+""+getPrenom().charAt(0)+""+getDateNaissance().getYear());
	}
	/*
	 * This method gives a textual representation of the student
	 */
	public String toString() {
		return super.toString()+"\nMatricule: "+this.matricule();
	}
	/*
	 * This method return the arrival Date of the student except if it is between 1/1/2000 and now
	 */
	public void setDateArrivee(LocalDate dateArrivee) throws DateArriveeInvalideException{
		if(dateArrivee.getYear()<2000 || dateArrivee.getYear() > LocalDate.now().getYear()) {
			throw new DateArriveeInvalideException("La date doit être >1/1/2000 et < maintenant");
		}
		super.setDateArrivee(dateArrivee);
	}
	/*
	 * this method gives the years spent in the school
	 */
	public int ancien() {
		return (super.getDateArrivee().until(LocalDate.now()).getYears());
	}
	
}
