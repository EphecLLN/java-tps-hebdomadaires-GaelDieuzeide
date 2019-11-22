package tp1;

public class Date {
	
	private int jour;
	private int mois;
	private int annee;

	public Date(String date) {
		String tab [] = date.split("/");
		this.jour = Integer.parseInt(tab[0]);
		this.mois = Integer.parseInt(tab[1]);
		this.annee = Integer.parseInt(tab[2]);
	}

public Date(int i, int j, int k) {
		// TODO Auto-generated constructor stub
	}

public String toString(){
	return("Date: " + this.jour + "-" + this.mois + "-" + this.annee);
}

public static void main(String[] args) {
	Date ddn = new Date("1/1/2010");
	
	System.out.println(ddn);
}
}