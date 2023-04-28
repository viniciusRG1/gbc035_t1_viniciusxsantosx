public class chefe extends funcionario{
    public chefe(String nome, String funcao, int idade, String cadastro, float salario){
        super(nome,funcao,idade,cadastro, salario);
        pagarSalario(salario);
    }
    public void pagarSalario(float salario){
       this.setSalario(3*salario);
    }
}
