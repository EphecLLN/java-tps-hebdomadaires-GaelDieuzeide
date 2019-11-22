package tp1;

import javax.swing.JOptionPane;

public class Calculatrice {
	double valeurCourante = Integer.parseInt(JOptionPane.showInputDialog("Quel chiffre?"));
	
	public void ajout(double n){
		valeurCourante += n;
	}
	
	public void soustrait(double n){
		valeurCourante -= n;
	}
	
	public void carre(){
		valeurCourante = Math.pow(valeurCourante, 2);
	}
}
