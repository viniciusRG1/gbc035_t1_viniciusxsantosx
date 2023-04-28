public class C2 extends  C1{
    private int p2;

    protected int t2;
    public C2(int p1, int p2, int t1, int t2){
        super(p1, t1);
        setP2(p2);
        setT2(t2);
    }

    public void mostrar(){
        super.mostrar();
        System.out.println("p2 :"+this.getP2()+" t2 :"+this.getT2());
    }

    public int getP2() {
        return p2;
    }

    public void setP2(int p2) {
        this.p2 = p2;
    }

    public int getT2() {
        return t2;
    }

    public void setT2(int t2) {
        this.t2 = t2;
    }
}

