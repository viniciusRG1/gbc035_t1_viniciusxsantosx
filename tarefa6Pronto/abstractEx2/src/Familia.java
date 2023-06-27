public class Familia extends Contato{
    private String Parentesco;
    public Familia(String apelido, String nome, String email, String aniversário, String parentesco){
        super(apelido, nome, email, aniversário);
        this.setParentesco(parentesco);
    }

    public String getParentesco() {
        return Parentesco;
    }

    public void setParentesco(String parentesco) {
        Parentesco = parentesco;
    }

    public void imprimirContato(){
        super.imprimirContato();
        System.out.println("parentesco: "+ this.getParentesco());
    }


}
