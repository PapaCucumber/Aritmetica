package ec;

public class EcuacionCuadratica {
    private double x2;
    private double x;
    private double indep;

    public EcuacionCuadratica(double x2, double x, double indep) {
        this.x2 = x2;
        this.x = x;
        this.indep = indep;
    }

    public double[] resolverEcuacion() throws ArithmeticException {
        double radicando = Math.pow(-this.x, 2) - 4 * this.x2 * this.indep;
        if (radicando < 0)
            throw new ArithmeticException();
        else if (this.x2 == 0) {
            EcuacionLineal lineal = new EcuacionLineal(this.x, this.indep);
            return new double[] {lineal.resolverEcuacion()};
        }
        else {
            double x1 = (-this.x + Math.sqrt(radicando)) / (2 * this.x2);
            double x2 = (-this.x - Math.sqrt(radicando)) / (2 * this.x2);
            return new double[] {x1, x2};
        }
    }
}
