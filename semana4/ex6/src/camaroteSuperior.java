public class camaroteSuperior extends VIP{
    public camaroteSuperior(float valor){
        super(valor);
        setValor(valor);
    }

    public void setValor(float valor){
        this.valor = valor * 1.89f;
    }

}
