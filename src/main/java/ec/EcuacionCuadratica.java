package ec;

public class EcuacionCuadratica extends EcuacionLineal{
    public double x2;

    public EcuacionCuadratica(double x2, double x, double indep) {
        super(x, indep);
        this.x2 = x2;
    }
}
