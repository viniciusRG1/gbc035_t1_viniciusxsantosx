public class Produto implements Classificavel{
    private int codigo;

    public Produto(int codigo){
        this.setCodigo(codigo);
    }
    public boolean eMenorQue(Classificavel o){
        Produto compara = (Produto) o;
        if(this.codigo < compara.codigo){
            return true;
        }else{
            return false;
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
