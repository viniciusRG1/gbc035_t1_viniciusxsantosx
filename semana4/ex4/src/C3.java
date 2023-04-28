public class C3 extends  C2{
    private int p3;

    protected int t3;
    public C3(int p1, int p2, int t1, int t2, int p3, int t3){
        super(p1, t1, p2, t2);
        setP3(p3);
        setT3(t3);
    }

    public int getP3() {
        return p3;
    }

    public void setP3(int p3) {
        this.p3 = p3;
    }

    public int getT3() {
        return t3;
    }

    public void setT3(int t3) {
        this.t3 = t3;
    }

    public void mostrar(){
        super.mostrar();
        System.out.println("p3 :"+this.getP2()+" t3 :"+this.getT2());
    }
}


