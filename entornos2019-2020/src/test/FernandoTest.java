package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personas.Fernando;

class FernandoTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testLlamame() {
		Fernando f=new Fernando("Fernando");
		String respuesta=f.llamame("hola caracola");
		String esperado="hole cerecolde";
	    assertEquals(esperado, respuesta); 
	}

	@Test
	void testFernando() {
		fail("Not yet implemented");
	}

}
