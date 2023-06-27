public class Serviço implements Classificavel{
    private float Preco;

    public Serviço(float Preco){
        this.setPreco(Preco);
    }

    public boolean eMenorQue(Classificavel o){
        Serviço compara = (Serviço) o;
        if(this.Preco < compara.Preco){
            return true;
        }else{
            return false;
        }
    }

    public float getPreco() {
        return Preco;
    }

    public void setPreco(float preco) {
        Preco = preco;
    }
}

