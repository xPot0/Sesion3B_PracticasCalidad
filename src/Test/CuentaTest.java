package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import main.Cuenta;

class CuentaTest {

	Cuenta cuenta;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		cuenta = new Cuenta("1234567","Pepe");
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
	}
	
	@Test
	void testgetSaldo() {
		assertEquals(0,cuenta.getSaldo());
	}
	
	@Test
	void testgetTitular() {
		assertEquals("Pepe",cuenta.getTitular());
	}
	
	@Test
	void testgetNumero() {
		assertEquals("1234567",cuenta.getNumero());
	}
	
	@Test
	void testgetIngresar() {
		cuenta.ingresar(500);
		assertEquals(500,cuenta.getSaldo());
	}
	
	@Test
	void testRetirar() {
		cuenta.retirar(500);
		assertEquals(-500,cuenta.getSaldo());
	}
	
}
