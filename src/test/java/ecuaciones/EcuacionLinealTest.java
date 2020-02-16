package ecuaciones;

import static org.junit.Assert.*;

import org.junit.Test;

import ec.EcuacionLineal;

public class EcuacionLinealTest {

	@Test
	public void terminoACeroTest() {
		EcuacionLineal ecuacionLineal = new EcuacionLineal(0, 1); // 0x + 1 = 0

		//Forzamos el error, si captura la excepción funciona bien ya que 0/algo es indefinido

		//try-catch es una estructura dedicada a capturar esxcepciones
		try {
			double[] actual = ecuacionLineal.resolver(0, ecuacionLineal.x, ecuacionLineal.indep);
			//No debería entrar nunca aquí, si lo hace hacemos que falle el test
			fail("Error, no da la excepción que debería");
		} catch (ArithmeticException DivisionEntreCero) {
			System.out.println("Excepción capturada");
		}
	}

	@Test
	public void AdistintoDeCeroTest() {
		EcuacionLineal ecuacionLineal = new EcuacionLineal(1, 1); // x + 1 = 0
		double[] actual = ecuacionLineal.resolver(0, ecuacionLineal.x, ecuacionLineal.indep);
		assertEquals(-1, actual[0], 0);

		ecuacionLineal = new EcuacionLineal(2, 1); // 2x + 1 = 0
		actual = ecuacionLineal.resolver(0, ecuacionLineal.x, ecuacionLineal.indep);
		assertEquals(-0.5, actual[0], 0);
	}
}
