package ecuacion;

public class EcuacionLineal {
    private int x;
    private int indep;

    public EcuacionLineal(int x, int indep) {
        this.x = x;
        this.indep = indep;
    }

    public int resolverEcuacion () throws ArithmeticException {
        if (this.x != 0) { return (-this.indep/this.x); }
        else throw new ArithmeticException();
    }
}
