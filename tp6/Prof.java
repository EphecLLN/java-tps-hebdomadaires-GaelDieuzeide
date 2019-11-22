package tp1;

import javax.swing.JOptionPane;
/**
 *  This class represents a teacher
 * @author gael-
 *
 */
public class Prof extends {
	private String nom;
	/**
	 * The name of the teacher
	 */
		
	private String prenom;
	/**
	 * The forname of the teacher
	 */
	private String specialite;
	/**
	 * The speciality of the teacher
	 */

	public Prof() {
		this.nom = JOptionPane.showInputDialog("Entrez le nom");
		this.prenom = JOptionPane.showInputDialog("Entrez le prénom");
		this.specialite = JOptionPane.showInputDialog("Entrez la spécialité");
	}
	
	/**
	 * This constructor allows the the user to create the teacher knowing nothing
	 * @param nom name of the teacher
	 * @param prenom forename of the teacher
	 * @param specialite speciality of the teacher
	 */
	
	public Prof(String nom,String prenom, String specialite) {
		this.nom = nom;
		this.prenom = prenom;
		this.specialite = specialite;
	}
	
	/**
	 * This constructor allows the the user to create the teacher knowing his name forename and speciality
	 *@param nom name of the teacher
	 * @param prenom forename of the teacher
	 * @param specialite speciality of the teacher
	 */

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

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	@Override
	public String toString() {
		return "Prof [nom=" + nom + ", prenom=" + prenom + ", specialite=" + specialite + "]";
	}
	/**
	 * This method gives a textual representation of the teacher
	 */
}
