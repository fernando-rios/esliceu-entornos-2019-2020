package test;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.*;
import personas.Jero;

class JeroTest {
	
	static String palabra;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.print("Comencen els tests");
	}
	
	@BeforeEach
	static void setUp() throws Exception {
		System.out.print("Comença el test");
	}
	
	@AfterEach
	static void tearDown() throws Exception {
		System.out.print("S'ha acabat el test");
	}
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.print("S'han acabat els tests");
	}
	
	@Test
	void testLlamame() {
		Jero j = new Jero("Jero");
		palabra = "Jero";
		assertEquals(j.llamame("Jero"),palabra);
	}

}
