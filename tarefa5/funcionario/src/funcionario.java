public class funcionario {
    protected String CPF;
    protected String Nome;
    protected float Salario;
    public funcionario(String CPF, String nome, float salario){
        if(salario > 0){
            if(salario > 4000){
                System.out.println("o limite foi ultrapassado");
                System.out.println("será colocado o limite");
                this.setSalario(40000);
            }else{
                this.setSalario(salario);
            }
            this.setNome(nome);
            this.setCPF(CPF);
    }else{
            System.out.println("não existe salario negativo");
        }
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public float getSalario() {
        return Salario;
    }

    public void setSalario(float salario) {
        Salario = salario;
    }

    public void aumentarSalario(float aumento){
        if(this.getSalario() * (1+aumento) > 40000){
            System.out.println("o limite foi ultrapassado");
            return;
        }
        this.setSalario(this.getSalario() * (1+aumento));
    }


}
