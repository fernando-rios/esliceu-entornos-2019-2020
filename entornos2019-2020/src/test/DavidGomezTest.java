package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import personas.DavidGomez;

class DavidGomezTest {

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
		DavidGomez d = new DavidGomez("David");
		assertEquals("David¯\\_(ツ)_/¯", d.llamame("David"));
	}

}
