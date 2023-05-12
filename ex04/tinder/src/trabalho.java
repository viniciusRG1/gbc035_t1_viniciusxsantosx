public class trabalho extends contato{
    private String hierarquia;
    public trabalho(String email, String nome, String apelido, String aniversario, String hierarquia){
        super(email, nome, apelido, aniversario);
        this.setHierarquia(hierarquia);
    }

    public String getHierarquia() {
        return hierarquia;
    }

    public void setHierarquia(String hierarquia) {
        this.hierarquia = hierarquia;
    }
}
