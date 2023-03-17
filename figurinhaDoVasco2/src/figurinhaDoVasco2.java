public class figurinhaDoVasco2 {

    public figurinhaDoVasco2(String nome, String nascimento, float altura, float peso, String posicao, String pais){
        this.setAltura(altura);
        this.setName(nome);
        this.setNascimento(nascimento);
        this.setPosicao(posicao);
        this.setPais(pais);
        this.setPeso(peso);
    }
    private String name;
    private String nascimento;
    private float altura;
    private float peso;
    private String posicao;
    private String pais;

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }
}
