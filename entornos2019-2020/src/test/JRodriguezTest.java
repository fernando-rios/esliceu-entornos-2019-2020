package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personas.JDRodriguez;

public class JRodriguezTest {
	static String palabra = "";
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		palabra += "Primera palabra";
		System.out.println(palabra);
	}
	
	@BeforeEach
	void setUp() throws Exception {
		palabra = "Segunda palabra";
		System.out.println(palabra);
	}
	
	@AfterEach
	void tearDown() throws Exception {
		palabra = "Tercera palabra";
		System.out.println(palabra);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		palabra = "Cuarta palabraw";
		System.out.println(palabra);
	}
	
	@Test
	void testLlamame() {
		JDRodriguez j = new JDRodriguez("Jose");
		palabra = "Este es el primer test";
		assertEquals(palabra, j.llamame("Hola, primer test"));
		System.out.println(palabra);
	}
	
}