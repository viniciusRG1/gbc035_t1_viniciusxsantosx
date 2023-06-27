public class EstudanteDoutorado extends EstudantePosGrad {
    String tituloTese;

    public EstudanteDoutorado(String nome, String endereco, String formacao, String linhadDePesquisa, String tituloTese) {
        super(nome, endereco, formacao, linhadDePesquisa);
        this.tituloTese = tituloTese;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("EstudanteDoutorado{" +
                "tituloTese='" + tituloTese + '\'' +
                '}');

    }

    public void print(boolean opc) {
        if(opc == true){
            System.out.print("EstudanteDoutorado{"+ this.getNome() + ';' +
                    ", " + this.getEndereco() +
                    ";" + tituloTese + ';' + this.getFormacao() +';' + this.getLinhaDePesquisa() +
                      '}');
        }else{
            System.out.println("EstudanteDoutorado{");
            System.out.println(this.getNome());
            System.out.println(this.getTituloTese());
            System.out.println(this.getEndereco());
            System.out.println(this.getFormacao());
            System.out.println(this.getLinhaDePesquisa());
        }
    }

    public String getTituloTese() {
        return tituloTese;
    }

    public void setTituloTese(String tituloTese) {
        this.tituloTese = tituloTese;
    }
}
