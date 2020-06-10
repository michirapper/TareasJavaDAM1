import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculadoraTest4 {
	private int nume1;
	private int nume2;
	private int resul;

	public CalculadoraTest4(int numel, int nume2, int resul) {
		this.nume1 = numel;
		this.nume2 = nume2;
		this.resul = resul; // resultado de 1a operación
	}

	@Parameters
	public static Collection<Object[]> numeros() {
		return Arrays.asList(new Object[][] { { 20, 10, 2 }, { 30, -2, -15 }, { 5, 2, 3 } });
	}

	@Test
	public void testDivide() {
		PruebaCalculadora calcu = new PruebaCalculadora(nume1, nume2);
		int resultado = calcu.divide();
		assertEquals(resul, resultado);
	}
}