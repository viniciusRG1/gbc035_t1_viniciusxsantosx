public class Trabalho extends Contato{
    private String contato;
    private int grau;
    public Trabalho(String apelido, String nome, String email, String aniversário, String contato, int grau){
        super(apelido, nome, email, aniversário);
        this.setContato(contato);
        this.setGrau(grau);
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public void ImprimirContato(){
        super.ImprimirContato();
        System.out.println("tipo de trbalho: "+this.getContato());
    }

    public int getGrau() {
        return grau;
    }

    public void setGrau(int grau) {
        this.grau = grau;
    }

    public String grauDeAfinidade(){
        if(this.getGrau() == 1){
            return "melhor amigo";
        }else if(this.getGrau() == 2){
            return "amigo";
        }else if(this.getGrau() == 3){
            return "conhecido";
        }else{
            return "o grau está fora do padrão";
        }
    }
}
