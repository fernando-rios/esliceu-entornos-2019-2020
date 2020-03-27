package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personas.Juanfrancisco;

public class JuanfranciscoTest {
	
	static String mensaje = "";

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		mensaje= "Primer paso: BeforeAll";
		System.out.println(mensaje);
	}
	
	@BeforeEach
	void setUp() throws Exception {
		mensaje= "Segundo paso: BeforeEach";
		System.out.println(mensaje);
	}

	@Test
	void testLlamame() {
		Juanfrancisco j = new Juanfrancisco("Juanfrancisco");
		mensaje = "Primer test";
		assertEquals(mensaje, j.llamame("Primer test"));
		System.out.println(mensaje);
		}

	@AfterEach
	void tearDown() throws Exception {
		mensaje= "Tercer paso: AfterEach";
		System.out.println(mensaje);
	}
	
	// before each
	
	@Test
	void testLlamame2() {
		Juanfrancisco j = new Juanfrancisco("Juanfrancisco");
		mensaje = "Segundo test";
		assertEquals(mensaje, j.llamame("Segundo test"));
		System.out.println(mensaje);
		}
	
	//after each

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		mensaje= "Ultimo paso: AfterAll";
		System.out.println(mensaje);
	}



	
	
}
