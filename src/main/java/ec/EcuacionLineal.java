package ec;

public class EcuacionLineal {
    private double x;
    private double indep;

    public EcuacionLineal(double x, double indep) {
        this.x = x;
        this.indep = indep;
    }

    public double resolverEcuacion () throws ArithmeticException {
        if (this.x != 0) { return (-this.indep/this.x); }
        else throw new ArithmeticException();
    }
}
