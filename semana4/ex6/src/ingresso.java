public class ingresso {
    protected float valor;

    public ingresso(float preco){
        setValor(preco);
    }
    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int normalOrVip(){
        if(this.valor > 20){
            System.out.println("ingresso VIP");
            return 1;
        }else{
            System.out.println("ingresso normal");
            return 0;
        }
    }

    public void mostrarValor(){
        System.out.println("o valor é:"+ this.getValor());
    }
}
