public abstract class Contato {
    protected String apelido;
    protected String nome;
    protected String email;
    protected String aniversário;

    public Contato(String apelido, String nome, String email, String aniversário){
        this.setApelido(apelido);
        this.setNome(nome);
        this.setEmail(email);
        this.setAniversário(aniversário);
    }

    public void imprimirContato(){
        System.out.println("nome: "+this.getNome());
        System.out.println("apelido: "+this.getApelido());
        System.out.println("email: "+this.getEmail());
        System.out.println("aniversário: "+this.getAniversário());
    }


    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getAniversário() {
        return aniversário;
    }

    public void setAniversário(String aniversário) {
        this.aniversário = aniversário;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void ImprimirContato(){
        this.ImprimirContato();
    }
}
