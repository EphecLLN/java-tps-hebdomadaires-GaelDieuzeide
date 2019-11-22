/**
 * 
 */
package tp1;

import javax.swing.JOptionPane;

/**
 * @author HE201589
 *
 */
public class TestCalc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calculatrice maCalc = new Calculatrice();

		System.out.println(maCalc.valeurCourante);
		maCalc.ajout(Integer.parseInt(JOptionPane.showInputDialog("Quel chiffre à additionner?")));
		System.out.println(maCalc.valeurCourante);
		maCalc.soustrait(Integer.parseInt(JOptionPane.showInputDialog("Quel chiffre à soustraire?")));
		System.out.println(maCalc.valeurCourante);
		maCalc.carre();
		System.out.println(maCalc.valeurCourante);
	}

}
