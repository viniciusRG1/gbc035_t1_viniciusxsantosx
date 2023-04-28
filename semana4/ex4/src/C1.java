public class C1 {
    private int p1;
    protected int t1;

    public C1(int p1, int t1){
        this.setP1(p1);
        this.setT1(t1);
    }

    public int getP1() {
        return p1;
    }

    public void setP1(int p1) {
        this.p1 = p1;
    }

    public int getT1() {
        return t1;
    }

    public void setT1(int t1) {
        this.t1 = t1;
    }

    public void mostrar(){
        System.out.println("p1 :"+this.getP1()+" t1 :"+this.getT1());
    }
}
