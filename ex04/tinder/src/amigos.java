public class amigos extends contato{
    private String grau;
    public amigos(String email, String nome, String apelido, String aniversario, int grauAmizade){
        super(email, nome, apelido, aniversario);
        this.grauAmizade(grauAmizade);
    }

    public void grauAmizade(int grauAmizade){
        if(grauAmizade == 1){
            this.setGrau("melhor amigo");
        }else if(grauAmizade == 2){
            this.setGrau("amigo");
        }else{
            this.setGrau("conhecido");
        }
    }

    public String getGrau() {
        return grau;
    }

    public void setGrau(String grau) {
        this.grau = grau;
    }


}
