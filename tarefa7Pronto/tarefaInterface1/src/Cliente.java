public class Cliente implements Classificavel{
    private String nome;

    public Cliente(String nome){
        this.setNome(nome);
    }
    public boolean eMenorQue(Classificavel o){
        Cliente compara = (Cliente) o;
        return this.nome.equals(compara.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
