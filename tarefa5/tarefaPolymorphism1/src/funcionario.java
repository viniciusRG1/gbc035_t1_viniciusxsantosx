public class funcionario {
    private String nome;
    private String nascimento;
    private float salario;

    public funcionario(String nome, String nascimento){
        this.setNome(nome);
        this.setNascimento(nascimento);
    }
    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
