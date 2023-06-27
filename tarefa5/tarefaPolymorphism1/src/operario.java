public class operario extends funcionario{
    public operario(String nome, String nascimento, float pecoPorPeca, int pecaFeita){
        super(nome, nascimento);
        this.setSalario(pecoPorPeca, pecaFeita);
    }

    public void setSalario(float pecoPorPeca, int pecaFeita){
        this.setSalario(pecoPorPeca * pecaFeita);
    }
}
