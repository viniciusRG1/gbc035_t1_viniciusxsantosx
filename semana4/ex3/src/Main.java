public class Main {
    public static void main(String[] args) {
        figurinha f1 = new figurinha("vinicius", "11/01/2001", 1.87f, 96.1f, "ATA", "Brasil", 77);

        figurinhaPrime f2 = new figurinhaPrime("ana", "16/01/2004", 1.72f, 85.2f, "GOL", "Brasil", 75);

        f1.mostrar();
        f2.mostrar();
    }
}