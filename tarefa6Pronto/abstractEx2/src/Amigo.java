public class Amigo extends Contato{
    private int grau;
    public Amigo(String apelido, String nome, String email, String aniversário, int grau){
        super(apelido, nome, email, aniversário);
        this.setGrau(grau);
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

    public void imprimirContato(){
        super.imprimirContato();
        System.out.println("grau de amizade: "+this.grauDeAfinidade());
    }
}
