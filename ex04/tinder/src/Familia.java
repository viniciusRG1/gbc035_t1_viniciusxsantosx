public class Familia extends contato{
    private String parentesco;
    public Familia(String email, String nome, String apelido, String aniversario, String parentesco){
        super(email, nome, apelido, aniversario);
        this.setParentesco(parentesco);
    }
    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public void imprimirBasico(Familia CE){
        super.imprimirBasico(CE);
        System.out.println(this.getParentesco());
    }
}
