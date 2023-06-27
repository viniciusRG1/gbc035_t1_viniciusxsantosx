public class vendedor extends funcionario{
    public vendedor(String nome, String nascimento, float salario, int vendas){
        super(nome, nascimento);
        this.setSalario(salario, vendas);
    }

    public void setSalario(float salario, int vendas){
        this.setSalario(salario+(3 * vendas));
    }
}
