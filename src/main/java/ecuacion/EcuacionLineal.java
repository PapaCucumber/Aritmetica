package ecuacion;

public class EcuacionLineal {
    private int x;
    private int indep;

    public EcuacionLineal(int x, int indep) {
        this.x = x;
        this.indep = indep;
    }

    public int ResolverEcuacion (EcuacionLineal ecuacion) throws ArithmeticException {
        if (ecuacion.x != 0) return -ecuacion.indep/ecuacion.x;
        else throw new ArithmeticException();
    }
}
