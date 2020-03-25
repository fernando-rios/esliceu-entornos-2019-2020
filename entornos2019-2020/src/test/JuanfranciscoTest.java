package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personas.Juanfrancisco;

public class JuanfranciscoTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {}

	@AfterAll
	static void tearDownAfterClass() throws Exception {}

	@BeforeEach
	void setUp() throws Exception {}

	@AfterEach
	void tearDown() throws Exception {}
	
	@Test
	void testLlamame() {
		Juanfrancisco j = new Juanfrancisco("Juanfrancisco");
		assertEquals("PILOTES!", j.llamame("Pilotes!"));
	}
}
