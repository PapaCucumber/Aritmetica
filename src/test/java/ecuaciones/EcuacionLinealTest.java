package ecuaciones;

import static org.junit.Assert.*;

import org.junit.Test;

import ecuacion.EcuacionLineal;

public class EcuacionLinealTest {

	@Test
	public void terminoIndependienteCeroTest() {
		EcuacionLineal ecuacionLineal = new EcuacionLineal(1, 0); // x + 0 = 0

		int actual = ecuacionLineal.resolverEcuacion();
		int esperado = 0;
		assertEquals(esperado, actual);
	}

	@Test
	public void distintosDeCeroTest() {
		EcuacionLineal ecuacionLineal = new EcuacionLineal(1, 1); // x + 1 = 0
		int actual = ecuacionLineal.resolverEcuacion();
		int esperado = -1;

		assertEquals(-1, actual);

		ecuacionLineal = new EcuacionLineal(2, 1); // 2x + 1 = 0
		actual = ecuacionLineal.resolverEcuacion();
		assertEquals(-0.5, actual);
	}
}
