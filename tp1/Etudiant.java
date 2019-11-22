package tp1;

import javax.swing.JOptionPane;

public class Etudiant {
	private String nom;
	private String prenom;
	private int matricule;
	
	public Etudiant() {
		this.nom = JOptionPane.showInputDialog("Entrez le nom");
		this.prenom = JOptionPane.showInputDialog("Entrez le prenom");
		this.matricule = Integer.parseInt(JOptionPane.showInputDialog("Entrez le matricule"));
	}
	
	public Etudiant(String nom, String prenom, int matricule) {
		this.nom = nom;
		this.prenom = prenom;
		this.matricule = matricule;
	}
	
	public Etudiant(String nom, String prenom,String matricule) {
		this.nom = nom;
		this.prenom = prenom;
		this.matricule = Integer.parseInt(matricule);
	}
	
	public Etudiant(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
		this.matricule = Integer.parseInt(JOptionPane.showInputDialog("Entrez le matricule"));
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getNom() {
		return this.nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getMatricule() {
		return matricule;
	}

	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}
	
	public String toString() {
		return ("Nom: " + this.nom + "\nPrénom: " + this.prenom + "\nMatricule: " + this.matricule);
	}
	
}
