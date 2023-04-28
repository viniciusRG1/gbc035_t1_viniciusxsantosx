public class camaroteInferior extends VIP{
    public camaroteInferior(float valor){
        super(valor);
        setValor(valor);
    }

    public void setValor(float valor){
        this.valor = valor * 1.4f;
    }

}
