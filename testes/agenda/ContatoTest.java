package agenda;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class ContatoTest {
	
	
	@Test
	void testContato() {
		new Contato("Matheus", "Gaudencio", "(83) 99999-0000");
	}
	
	@Test
	void testContatoNomeVazio() {
		try {
			new Contato("", "Gaudencio", "(83) 99999-0000");
			fail("Era esperado uma execeção");
		} catch (IllegalArgumentException e) {
		}
	}
	
	@Test
	void testContatoNomeNulo() {
		try {
			new Contato(null, "Gaudencio", "(83) 99999-0000");
			fail("Era esperado uma execeção");
		} catch (IllegalArgumentException e) {
		}
	}
	
	@Test
	void testTelefoneVazio() {
		try {
			new Contato("Matheus", "Gaudencio", "");
			fail("Era esperado uma execeção");
		} catch (IllegalArgumentException e) {
		}
	}
	
	@Test
	void testTelefoneNulo() {
		try {
			new Contato("Matheus", "Gaudencio", null);
			fail("Era esperado uma execeção");
		} catch (IllegalArgumentException e) {
		}
	}
	
	@Test
	void testEqualsObject() {
		Contato c1 = new Contato("Paulo", "Victor", "40028922");
		Contato c2 = new Contato("Matheus", "Gaudencio", "(83) 99999-0000");
		assertNotEquals(c1, c2);
	}
	
	@Test
	void testEqualsObjectIguais() {
		Contato c1 = new Contato("Matheus", "Gaudencio", "(83) 99999-0000");
		Contato c2 = new Contato("Matheus", "Gaudencio", "(83) 99999-0000");
		assertEquals(c1, c2);
	}

	@Test
	void testToString() {
		Contato c1 = new Contato("Matheus", "Gaudencio", "(83) 99999-0000");
		assertEquals("Matheus Gaudencio", c1.toString());
	}
}