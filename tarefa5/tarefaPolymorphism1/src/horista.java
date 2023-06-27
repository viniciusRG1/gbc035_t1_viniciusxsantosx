public class horista extends funcionario{
    public horista(String nome, String nascimento, float precoHora, int horaFeita){
        super(nome, nascimento);
        this.setSalario(precoHora, horaFeita);
    }

    public void setSalario(float precoHora, int horaFeita){
        this.setSalario(precoHora * horaFeita);
    }
}
