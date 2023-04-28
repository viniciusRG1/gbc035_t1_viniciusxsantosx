public class figurinha {
    private String nome;
    private String DataDeNacimento;
    private Float Altura;
    private Float Peso;
    private String Posicao;
    private String Pais;
    private String Cor;
    public figurinha(String nome, String dataDeNacimento, Float altura, Float peso, String posicao, String pais, int cor){
        this.setAltura(altura);
        this.setNome(nome);
        this.setDataDeNacimento(dataDeNacimento);
        this.setCor(cor);
        this.setPeso(peso);
        this.setPosicao(posicao);
        this.setPais(pais);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDeNacimento() {
        return DataDeNacimento;
    }

    public void setDataDeNacimento(String dataDeNacimento) {
        DataDeNacimento = dataDeNacimento;
    }

    public Float getAltura() {
        return Altura;
    }

    public void setAltura(Float altura) {
        Altura = altura;
    }

    public Float getPeso() {
        return Peso;
    }

    public void setPeso(Float peso) {
        Peso = peso;
    }

    public String getPosicao() {
        return Posicao;
    }

    public void setPosicao(String posicao) {
        Posicao = posicao;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        Pais = pais;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(int cor) {
        if(cor < 50){
            Cor = "bordo";
        }else if(cor < 65){
            Cor = "bronze";
        }else if(cor < 75){
            Cor = "prata";
        }else {
            Cor = "ouro";
        }
    }

    public void mostrar(){
        System.out.println("o jogador "+this.getNome()+" tem uma cartinha "+this.getCor());
        System.out.println("nasceu em "+this.getDataDeNacimento()+" no pais "+this.getPais());
        System.out.println("tem a altura de "+this.getAltura()+" e pesa "+this.getPeso());
        System.out.println("e joga na posicao "+this.getPosicao());
    }
}
