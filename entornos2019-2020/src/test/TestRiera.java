package test;
import static org.junit.jupiter.api.*;
import org.junit.jupiter.api.*;
import personas.MiguelAngelRiera

public class TestRiera {
	@BeforeAll
	static void setUpBeforeClass() throws Exception {

	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {

	}

	@BeforeEach
	void setUp() throws Exception {

	}

	@AfterEact
	void tearDown() throws Exception {

	}

	@Test
	void testLlamame() {

		Riera r = new Riera("TestRiera");

		assertEquals("HOLA CLASE", r.llamame("hola clase"));

	}
}
