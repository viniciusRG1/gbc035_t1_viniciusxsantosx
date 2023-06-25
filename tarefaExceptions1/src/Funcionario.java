public class Funcionario {
    private String Nome;
    private String CPF;
    private float Salario;

    private float TetoSalarial;

    public Funcionario(String Nome, String CPF, float Salario, float TetoSalaria){
        this.setCPF(CPF);
        this.setSalario(Salario);
        this.setNome(Nome);
        try {
            this.setTetoSalarial(TetoSalaria);
        } catch (TetoSalariaException e) {
            throw new RuntimeException(e);
        }
    }
    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public float getSalario() {
        return Salario;
    }

    public void setSalario(float salario) throws ilegalSalario{
        if(salario <= this.getTetoSalarial()){
            Salario = salario;
        }else if(salario < 0){
            throw new ilegalSalario("Valor inválido de salário");
        }else{
            throw new ilegalSalario("esse valor é maior que o teto salarial");
        }

    }

    public float getTetoSalarial() {
        return TetoSalarial;
    }

    public void setTetoSalarial(float tetoSalarial) throws TetoSalariaException{
        if(tetoSalarial <= 40000){
            TetoSalarial = tetoSalarial;
        }else{
            throw new TetoSalariaException("esse valor é maior que o limite de teto salarial");
        }
    }

    public void aumentoPercent(float porcentagem) throws TetoSalariaException{
        if(this.getSalario()*porcentagem <= this.getTetoSalarial()){
            this.setSalario(this.getSalario()*porcentagem);
        }else if(this.getSalario()*porcentagem < 0){
            throw new TetoSalariaException("não existe saario menor que 0");
        }else{
            throw new TetoSalariaException("esse aumento ultrapassa o limite do Teto");
        }
    }
}
