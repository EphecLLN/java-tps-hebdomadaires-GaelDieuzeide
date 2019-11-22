package tp1;

import javax.swing.JOptionPane;
/**
 * the class represents a student
 * @author HE201589
 *
 */
public class Etu {
	/**
	 * The name of the student
	 */
	private String nom;
	/**
	 * The forname of the student
	 */
	private String prenom;
	/**
	 * The ID of the student
	 */
	private int matricule;
	/**
	 * This constructor creates a student using the name, the forname and the ID passed
	 * @param nom the name of the student
	 * @param prenom the forname of the student
	 * @param matricule the ID of the student
	 */
	public Etu(String nom, String prenom,int matricule){
		this.nom = nom;
		this.prenom = prenom;
		this.matricule = matricule;
	}
	
	/**
	 * This constructor creates a student and asks the user the different values for the student
	 */
	
	public Etu(){
		this.nom = JOptionPane.showInputDialog("Entrez le nom de la personne");
		this.prenom = JOptionPane.showInputDialog("Entrez le prenom de la personne");
		this.matricule = Integer.parseInt(JOptionPane.showInputDialog("Entrez le matricule de la personne"));
	}
	
	/**
	 * This constructor creates a student with only the name and the forname. the ID has to be set by the user
	 */
	
	public Etu(String nom,String prenom){
		this.nom = nom;
		this.prenom = prenom;
	}
	/**
	 * 
	 * @return the name of the student
	 */
	public String getNom(){
		return this.nom;
	}
	
	/**
	 * This getter allows the user to set or change the name of the student
	 * @param nom the new name of the student
	 */
	
	public void setNom(String nom){
		this.nom = nom;
	}

	/**
	 * 
	 * @return the forname of the student
	 */
	
	public String getPrenom() {
		return prenom;
	}

	/**
	 * This getter allows the user to set or change the name of the student
	 * @param nom the new forname of the student
	 */
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * 
	 * @return the ID of the student
	 */
	
	public int getMatricule() {
		return matricule;
	}

	/**
	 * This getter allows the user to set or change the name of the student
	 * @param nom the new ID of the student
	 */
	
	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}
	
	/**
	 * This method gives a textual representation of the student
	 */
	
	public String toString(){
		return("Nom: " + this.nom + "\nPrénom: " + this.prenom + "\nMatricule: " + this.matricule);
	}
	
}


