package Ecole;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Test;

public class ProfTest {
	Prof toto = new Prof("wayne", "toto",LocalDate.of(1998, Month.DECEMBER, 24),LocalDate.of(2016, Month.SEPTEMBER, 9));
	Prof bruce = new Prof("bond", "bruce",LocalDate.of(1990, Month.DECEMBER, 24),LocalDate.of(2017, Month.SEPTEMBER, 9));
	Prof jan = new Prof("potter", "harry",LocalDate.of(1990, Month.DECEMBER, 24),LocalDate.of(2011, Month.SEPTEMBER, 9));
	
	@Test
	
	public void testAnciennete() {
		assertEquals("Le professeur n'a pas encore atteint l'âge requit pour pouvoir évaluer son ancienneté.", toto.anciennete());
		assertEquals("L'ancienneté du professeur vaut: 1", bruce.anciennete());
		assertEquals("L'ancienneté du professeur vaut: 5", jan.anciennete());
		
	}

}

