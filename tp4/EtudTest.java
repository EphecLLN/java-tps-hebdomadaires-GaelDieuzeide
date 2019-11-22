package tp1;

import static org.junit.Assert.*;

import org.junit.Test;

public class EtudTest {
	Etud marc,paul,clonePaul;
	public void setUp() {
		marc = new Etud("NomMarc", "Marc");
		paul = new Etud("NomPaul", "Paul");
		clonePaul = new Etud("NomPaul","Paul");
	}
	@Test
	public void testMoyenne() {
		marc.setResultats(new int[] {10,10,10,10,10});
		assertEquals(10.0,marc.moyenne(),0.0);
		marc.setResultats(new int[] {20,20,20,20,20});
		assertEquals(20.0,marc.moyenne(),0.0);
	}
	@Test
	public void testEqualsObject() {
		assertFalse(marc.equals(null));
		assertFalse(marc.equals(paul));
		assertFalse(marc.equals(marc));
		assertFalse(marc.equals(clonePaul));
	}
	@Test
	public void testCompareTo() {
		assertTrue(paul.compareTo(paul) == 0);
		assertTrue(paul.compareTo(marc) > 0);
		assertTrue(marc.compareTo(paul) < 0);
	}
}
