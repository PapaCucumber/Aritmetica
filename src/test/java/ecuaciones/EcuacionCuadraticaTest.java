package ecuaciones;

//Los tests del JUnit se importan automaticamente cuando escribo el @
import ecuacion.EcuacionCuadratica;
import org.junit.Test;

public class EcuacionCuadraticaTest {

    @Test
    public void raizNegativaTest (){
        EcuacionCuadratica ecuacion = new EcuacionCuadratica(5, 10, 0);

    }
}