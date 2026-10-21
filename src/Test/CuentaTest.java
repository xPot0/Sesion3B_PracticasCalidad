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
	Cuenta c12345;
    Cuenta c67890;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		cuenta = new Cuenta("1234567","Pepe", 0);
		c12345 = new Cuenta("12345", "Titular 1", 50);
        c67890 = new Cuenta("67890", "Titular 2", 0);
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
	
	@Test
	void test0014() {
		c12345.retirar(200);
		assertEquals(-150,c12345.getSaldo());
		
		c67890.retirar(350);
		assertEquals(-350,c67890.getSaldo());
		
		c12345.ingresar(100);
		assertEquals(-50,c12345.getSaldo());
		
		c67890.retirar(200);
		assertEquals(-350,c67890.getSaldo());
		
		c67890.retirar(150);
		assertEquals(-500,c67890.getSaldo());
		
		c12345.retirar(200);
		assertEquals(-250,c12345.getSaldo());
		
		c67890.ingresar(50);
		assertEquals(-450,c67890.getSaldo());
		
		c67890.retirar(100);
		assertEquals(-450,c67890.getSaldo());
		
	}
	
}
