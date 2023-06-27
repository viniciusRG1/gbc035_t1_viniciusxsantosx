public class EstudanteGraduacao extends Estudante {
    private String tituloTCC;

    public EstudanteGraduacao(String nome, String endereco, String tituloTCC) {
        super(nome, endereco);
        this.tituloTCC = tituloTCC;
    }

    public void print() {
        super.print();
        System.out.println("EstudanteGraduacao{" +
                "tituloTCC='" + tituloTCC + '\'' +
                '}');
    }

    public void print(boolean opc) {
        if(opc == true){
            System.out.print("EstudanteDoutorado{"+ this.getNome() + ';' +
                    ", " + this.getEndereco() + ";" + this.getTituloTCC() + ";"+
                    '}');
        }else{
            System.out.println("EstudanteDoutorado{");
            System.out.println(this.getNome());
            System.out.println(this.getEndereco());
            System.out.println(this.getTituloTCC());
        }
    }

    public String getTituloTCC() {
        return tituloTCC;
    }

    public void setTituloTCC(String tituloTCC) {
        this.tituloTCC = tituloTCC;
    }
}