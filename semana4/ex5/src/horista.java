public class horista extends funcionario{
    public horista(String nome, String funcao, int idade, String cadastro, float salario, int horas){
        super(nome, funcao, idade, cadastro, salario);
        setSalario(salario, horas);
    }

    public void setSalario(float salario, int horas){
        Salario = (salario + (horas*7));
    }
}
