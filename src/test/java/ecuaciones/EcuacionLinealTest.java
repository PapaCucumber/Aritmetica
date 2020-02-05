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
			double actual = ecuacionLineal.resolverEcuacion();
			//No debería entrar nunca aquí, si lo hace hacemos que falle el test
			fail("Error, no da la excepción que debería");
		} catch (ArithmeticException DivisionEntreCero) {
			System.out.println("Excepción capturada");
		}
	}

	@Test
	public void AdistintoDeCeroTest() {
		EcuacionLineal ecuacionLineal = new EcuacionLineal(1, 1); // x + 1 = 0
		double actual = ecuacionLineal.resolverEcuacion();
		assertEquals(-1, actual, 0);

		ecuacionLineal = new EcuacionLineal(2, 1); // 2x + 1 = 0
		actual = ecuacionLineal.resolverEcuacion();
		assertEquals(-0.5, actual, 0);
	}

	/*JUnit funciona de la siguiente forma: cuando pruebo una función, el test
	es correcto solo si todos los assertsEquals dan bien (son iguales)

	Una funcion puede fallar o con un fail() (forzamos el fallo), o con un assertEquals que no da
	Los tests son siempre void creo
	 */

	//Dentro del main, hay que poner la menor cantidad de codigo posible. Más vale escribir un método void en la misma clase y llamarlo desde el main
}
