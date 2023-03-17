import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        figurinhaDoVasco2[] jogadores = new figurinhaDoVasco2[3];

        int t = 0;
        float f = 0;
        String r;
        for(t = 0; t < 3;t++){
            clearBuffer(sc);
            r = sc.nextLine();
            jogadores[t].setName(r);
            clearBuffer(sc);
            r = sc.nextLine();
            jogadores[t].setPais(r);
            clearBuffer(sc);
            r = sc.nextLine();
            jogadores[t].setNascimento(r);
            f = sc.nextFloat();
            jogadores[t].setAltura(f);
            clearBuffer(sc);
            r = sc.nextLine();
            jogadores[t].setPosicao(r);
            f = sc.nextFloat();
            jogadores[t].setPeso(f);
        }



    }

    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
    
}