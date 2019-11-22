package tp1;

import javax.swing.JOptionPane;
/**
 * 
 * @author gael-
 * this class represent a student with a ID and some results obtained during different tests
 */
public class Etud {
	private String nom;
	private String prenom;
	private int matricule;
	private static int nbEtu = 0;
	private int [] resultats;

/**
 * This constructor creates a student and asks the user his name , forename and ID
 */
public Etud() {
	this.nom = JOptionPane.showInputDialog("Entrez le nom");
	this.prenom = JOptionPane.showInputDialog("Entrez le prénom");
	//this.matricule = Integer.parseInt(JOptionPane.showInputDialog("Entrez le matricule"));
	nbEtu++;
	this.matricule = nbEtu;
}

public Etud(String nom, String prenom) {
	this.nom = nom;
	this.prenom = prenom;
	//this.matricule = matricule;
	nbEtu++;
	this.matricule = nbEtu;
}
/**
 * 
 * @param resultats
 * @return the results of the students
 */



public String getNom() {
	return nom;
}

public int[] getResultats() {
	return resultats;
}
public void setResultats(int[] resultats) {
	this.resultats = resultats;
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

public int getMatricule() {
	return matricule;
}

public void setMatricule(int matricule) {
	this.matricule = matricule;
}
/**
 * this methods computes the mean of the student's results
 * @return
 */
public double moyenne() {
	if(this.resultats == null) return 0;
	double somme = 0;
	for(int i:resultats) {
		somme +=i;
	}
	return somme/resultats.length;
}
/**
 * this method generates a textual representation of the student
 */
@Override
public String toString() {
	return "Etud [nom=" + nom + ", prenom=" + prenom + ", matricule=" + matricule + "]";
}
/**
 * this methods checks the equality between two students
 * @return true if both students have the same id,false otherwise
 */
public boolean equals(Object obj) {
	if(this == obj) return true;
	if(this == null) return false;
	if(this.getClass() != obj.getClass()) return false;
	Etud other = (Etud)obj;
	if(this.matricule != other.matricule) return false;
	return true;
}
/**
 * compare the current student with the one passed a parameter
 * @param etud the student to make the camparaison with
 * @return a positive int if the current student student is greather than the parameter,0 if the object is the same as the argument, a negative int otherwise
 */

public int compareTo(Etud etud) {
	if(this.equals(etud)) return 0;
	return this.matricule < etud.matricule ? -1 : 1;
}

public static int getNbEtu() {
	return nbEtu;
}

public static void setNbEtu(int nbEtu) {
	Etud.nbEtu = nbEtu;
}
}