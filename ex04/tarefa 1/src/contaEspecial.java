public class contaEspecial extends ContaCorrente{


    public contaEspecial(float val, int num, int pwd, float limite, int tipo){
        super(val, num, pwd);
        this.setLimite(limite);
        this.setTipo(tipo);
    }




}
