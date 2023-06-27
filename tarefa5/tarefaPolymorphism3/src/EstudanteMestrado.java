public class EstudanteMestrado extends EstudantePosGrad {
    private String tipo; // tipo pode ser acadêmico ou profisional
    private String tituloDissertacao;

    public EstudanteMestrado(String nome, String endereco, String formacao, String linhadDePesquisa, String tipo, String tituloDissertacao) {
        super(nome, endereco, formacao, linhadDePesquisa);
        this.tipo = tipo;
        this.tituloDissertacao = tituloDissertacao;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("EstudanteMestrado{" +
                "tipo='" + tipo + '\'' +
                ", tituloDissertacao='" + tituloDissertacao + '\'' +
                '}');
    }

    public void print(boolean opc) {
        if(opc == true){
            System.out.print("EstudanteMestrado{"+ this.getNome() + ';' +
                     this.getEndereco() +
                    ";" + this.getFormacao() +';' + this.getTipo() + ";" + this.getTituloDissertacao() +
                    '}');
        }else{
            System.out.println("EstudanteMestrado{");
            System.out.println(this.getNome());
            System.out.println(this.getEndereco());
            System.out.println(this.getFormacao());
            System.out.println(this.getTipo());
            System.out.println(this.getTituloDissertacao());
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTituloDissertacao() {
        return tituloDissertacao;
    }

    public void setTituloDissertacao(String tituloDissertacao) {
        this.tituloDissertacao = tituloDissertacao;
    }
}
