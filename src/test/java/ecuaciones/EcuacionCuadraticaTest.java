package ecuaciones;

//Los tests del JUnit se importan automaticamente cuando escribo el @
import ec.EcuacionCuadratica;
import org.junit.Test;

import static org.junit.Assert.*;

public class EcuacionCuadraticaTest {

    @Test
    public void raizNegativaTest () {
        EcuacionCuadratica cuadratica = new EcuacionCuadratica(5, 10, 10); //100 - 200 = -100
        try {
            double[] resultado = cuadratica.resolver(cuadratica.x2, cuadratica.x, cuadratica.indep);
            fail("Error, no se ha capturado la excepción raizNeativa");
        } catch (ArithmeticException raizNegativa) {
            System.out.println("Excepción capturada");
        }
    }

    @Test
    public void raizPositivaTest () {
        EcuacionCuadratica cuadratica = new EcuacionCuadratica(2, 5, 2);
        double[] resultado = cuadratica.resolver(cuadratica.x2, cuadratica.x, cuadratica.indep);
        assertArrayEquals(new double[] {-0.5, -2}, cuadratica.resolver(cuadratica.x2, cuadratica.x, cuadratica.indep), 0);
        System.out.println("Resultado calculado:\n" + "x1 = " + resultado[0] + "\nx2 = " + resultado[1]);
    }

    @Test
    public void AesCeroTest () {
        EcuacionCuadratica cuadratica = new EcuacionCuadratica(0, 5, -10);
        double[] resultado = cuadratica.resolver(cuadratica.x2, cuadratica.x, cuadratica.indep);

        if (resultado.length == 1) {
            assertEquals(2, cuadratica.resolver(cuadratica.x2, cuadratica.x, cuadratica.indep)[0], 0);
            System.out.println("Resultado de la ecuacion lineal: " + resultado[0]);
        }
        else
            fail("Error en la resolución de la ecuación lineal");
    }
}