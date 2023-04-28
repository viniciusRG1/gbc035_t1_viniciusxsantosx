public class figurinhaPrime extends figurinha{

    public figurinhaPrime(String nome, String dataDeNacimento, Float altura, Float peso, String posicao, String pais, int cor) {
        super(nome, dataDeNacimento, altura, peso, posicao, pais, cor);
    }
    private void prime(){
        System.out.println("essa carta é uma carta prime");
    }
}
