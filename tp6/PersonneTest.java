package Ecole;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

public class PersonneTest {

	Etu etu;
	LocalDate dN;
	LocalDate dA;
	
	@Before
	public void setUp() throws DateArriveeInvalideException{
		etu = new Etu();
		etu.setNom("Dewulf");
		etu.setPrenom("Arnaud");
		dN = LocalDate.of(2005, 1, 1);
		dA = LocalDate.of(2015, 1, 1);
		etu.setDateArrivee(dA);
		etu.setDateNaissance(dN);
	}
	
	@Test
	public void testAge() {
		assertEquals(dN.until(LocalDate.now()).getYears(),etu.age());
	}

}
