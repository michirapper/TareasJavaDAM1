import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PruebaCalculadoraTest {

//	@Test
//	void testPruebaCalculadora() {
//		fail("Not yet implemented");
//	}

	@Test
	public void testSuma() {
		PruebaCalculadora calcu = new PruebaCalculadora(20, 10);
		int resultado = calcu.suma();
		assertEquals(30, resultado);
	}

	@Test
	public void testResta() {
		PruebaCalculadora calcu = new PruebaCalculadora(20, 10);
		int resultado = calcu.resta();
		assertEquals(10, resultado);
	}

	@Test
	public void testMultiplica() {
		PruebaCalculadora calcu = new PruebaCalculadora(20, 50);
		int resultado = calcu.multiplica();
		assertEquals("Fallo en la multiplicación", 200, resultado);
	}

	@Test
	public void testDivide() {
		PruebaCalculadora calcu = new PruebaCalculadora(20, 0);
		int resultado = calcu.divide();
		assertEquals(2, resultado);
	}

//	@Test
//	public void testMultiplica() {
//		PruebaCalculadora calcu = new PruebaCalculadora(20, 10);
//		int resultado = calcu.multiplica();
//		assertEquals(200, resultado);
//	}
//
//	@Test
//	public void testDivide() {
//		PruebaCalculadora calcu = new PruebaCalculadora(20, 10);
//		int resultado = calcu.divide();
//		assertEquals(2, resultado);
//	}

}
