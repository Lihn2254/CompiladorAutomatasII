package ArbolSintactico;

public class Whilex extends Statx{
    private Expx s1;
    private Statx s2;
    
    public Whilex(Expx st1, Statx st2) {
        s1 = st1;
        s2 = st2;
    }
    
    public Object[] getVariables() {
        Object obj[] = new Object[2];
        obj[0] = s1;
        obj[1] = s2;
        return obj;
    }
}
