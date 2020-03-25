package test;

import static org.junit.jupiter.api.*;

import org.junit.jupiter.api.*;

import personas.Dani;

class DaniTest {

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
		Dani d = new Dani("DaniTest");
		assertEquals("FERNANDO APRUEBAME", j.llamame("Fernando apruebame"));
	}

}
