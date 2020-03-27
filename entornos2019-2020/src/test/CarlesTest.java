package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personas.Carles;

public class CarlesTest {
	static String frase = "";
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		frase += "Después de BeforeAll";
		System.out.println(frase);
	}
	
	@BeforeEach
	void setUp() throws Exception {
		frase = "Después de BeforeEach";
		System.out.println(frase);
	}
	
	@AfterEach
	void tearDown() throws Exception {
		frase = "Después de AfterEach";
		System.out.println(frase);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		frase = "Despues de AfterAll";
		System.out.println(frase);
	}
	
	@Test
	void testLlamame() {
		Carles c = new Carles("Carles");
		frase = "Hola, primer test";
		assertEquals(frase, c.llamame("Hola, primer test"));
		System.out.println(frase);
	}
	
	@Test
	void testMensaje() {
		Carles c = new Carles("Carles");
		frase = "Hola, segon test";
		assertEquals(frase, c.llamame("Hola, segon test"));
		System.out.println(frase);
	}

}