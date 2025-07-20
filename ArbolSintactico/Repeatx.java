package ArbolSintactico;

public class Repeatx extends Statx {
    public final Statx s;
    public final Expx e;

    public Repeatx(Statx s, Expx e) {
        this.s = s;
        this.e = e;
    }

    public Object[] getVariables() {
        Object obj[] = new Object[2];
        obj[0] = s;
        obj[1] = e;
        return obj;
    }
}
