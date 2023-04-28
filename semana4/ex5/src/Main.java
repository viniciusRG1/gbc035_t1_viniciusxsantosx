public class Main {
    public static void main(String[] args) {
        chefe cf = new chefe("vinicius", "chefe", 22, "12021BCC027", 1370f);
        vendedor cd = new vendedor("caio", "vendedor", 21, "12021BCC021", 1100, 40000);
        horista hr = new horista("ana", "horista", 20, "12021BCC017", 1300, 1430);
        hr.mostrar();
        cd.mostrar();
        cf.mostrar();
    }
}