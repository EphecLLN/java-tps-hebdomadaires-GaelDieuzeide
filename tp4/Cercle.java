package tp1;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Cercle {
	private double rayon;

	private Cercle(double rayon) {
		this.rayon = rayon;
	}
	
	public Cercle() {
		this.rayon = Double.parseDouble(JOptionPane.showInputDialog("Entrez le rayon du cercle"));
	}
	
	public double perim() {
		return (2*Math.PI*this.rayon);
	}
	
	public double aire() {
		return (Math.pow(this.rayon, 2)*Math.PI);
	}

	@Override
	public String toString() {
		NumberFormat formatter = new DecimalFormat("#0.00");
		return ("Cercle de Rayon : " + this.rayon + "\nP�rim�tre : " + formatter.format(this.perim()) + "\nAire : " + formatter.format(this.aire()));
	}
	
	public static void main(String[] args) {
		Cercle trigo = new Cercle();
		System.out.println(trigo);
	}
	
}	
