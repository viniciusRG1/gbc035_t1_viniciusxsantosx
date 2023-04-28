public class funcionario {
    protected String nome;
    protected String funcao;
    protected int idade;
    protected String cadastro;

    protected float Salario;

    public funcionario(String nome, String funcao, int idade, String cadastro, float salario){
        this.setCadastro(cadastro);
        this.setFuncao(funcao);
        this.setIdade(idade);
        this.setNome(nome);
        this.setSalario(salario);
    }

    public float getSalario() {
        return Salario;
    }

    public void setSalario(float salario) {
        Salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCadastro() {
        return cadastro;
    }

    public void setCadastro(String cadastro) {
        this.cadastro = cadastro;
    }

    public void mostrar(){
        System.out.println("nome: "+this.getNome()+" função: "+ this.getFuncao()+" idade: "+this.getIdade()+" cadastro: "+this.getCadastro()+" salario: "+this.getSalario());
    }
}

