public class ContaEspecial extends ContaCorrente{

    private float limite;
    public ContaEspecial(float val, int num, int pwd, float lim){
        super(val, num, pwd);
        this.setLimite(lim);
    }

    public float getLimite() {
        System.out.println("essa conta será modificada para uma conta comum");
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }
}
