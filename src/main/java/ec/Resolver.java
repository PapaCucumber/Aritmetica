package ec;

public class Resolver {

    public double[] resolver(double x2, double x, double indep) throws ArithmeticException {
        if (x2 == 0) {
            if (x != 0) { return new double[] {-indep/x}; }
            else throw new ArithmeticException();
        }
        else {
            double radicando = Math.pow(-x, 2) - 4 * x2 * indep;
            if (radicando < 0)
                throw new ArithmeticException();
            else {
                double sol1 = (-x + Math.sqrt(radicando)) / (2 * x2);
                double sol2 = (-x - Math.sqrt(radicando)) / (2 * x2);
                return new double[]{sol1, sol2};
            }
        }
    }
}
