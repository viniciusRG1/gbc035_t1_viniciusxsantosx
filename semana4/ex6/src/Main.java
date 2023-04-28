public class Main {
    public static void main(String[] args) {
        normal nm = new normal();
        camaroteInferior ci = new camaroteInferior(120f);
        camaroteSuperior cs = new camaroteSuperior(200f);

        nm.normalOrVip();
        ci.normalOrVip();
        cs.normalOrVip();

        nm.mostrarValor();
        ci.mostrarValor();
        cs.mostrarValor();
    }
}