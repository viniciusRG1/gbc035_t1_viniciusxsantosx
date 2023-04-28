public class vendedor extends funcionario{
    public vendedor(String nome, String funcao, int idade, String cadastro, float salario, int vendas){
        super(nome, funcao, idade, cadastro, salario);
        setSalario(salario, vendas);
    }

    public void setSalario(float salario, int vendas){
        this.Salario = (salario+(vendas*0.3f));
    }
}
