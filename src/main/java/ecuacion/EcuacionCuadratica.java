package ecuacion;

public class EcuacionCuadratica {
    private double x2;
    private double x;
    private double indep;

    public EcuacionCuadratica(double x2, double x, double indep) {
        this.x2 = x2;
        this.x = x;
        this.indep = indep;
    }

    public double[] resolverEcuacion(EcuacionCuadratica ecuacion) throws ArithmeticException {
        double resultado1 = (-ecuacion.x + Math.sqrt(Math.pow(-ecuacion.x, 2) - 4 * ecuacion.x2 * ecuacion.indep))/2*ecuacion.x2;
        double resultado2 = (-ecuacion.x - Math.sqrt(Math.pow(-ecuacion.x, 2) - 4 * ecuacion.x2 * ecuacion.indep))/2*ecuacion.x2;

        return new double[] {resultado1, resultado2};
    }
}
