package tp1;

public class Mainetud {
	public static void main(String[] args) {
		Etud paul = new Etud("Nom1", "Paul");
		Etud marc = new Etud("Nom2", "Marc");
		paul.setResultats(new int[] {10,10,10,10,10});
		marc.setResultats(new int[] {12,12,12,12,12});
		System.out.println(paul);
		System.out.println(marc);
		System.out.println("Moyenne de Paul: " + paul.moyenne());
		System.out.println("Moyenne de Marc: " + marc.moyenne());
		System.out.println("Marc et Paul sont-ils égaux?" + marc.equals(paul));
		Etud clonePaul = new Etud();
		clonePaul.setMatricule(paul.getMatricule());
		System.out.println("ClonePaul et Paul sont-ils égaux? " + clonePaul.equals(paul));
		System.out.println("Nous avons crée " + Etud.getNbEtu()+ "etudiants");
	}
}
