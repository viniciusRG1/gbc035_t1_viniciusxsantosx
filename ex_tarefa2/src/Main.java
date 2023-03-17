import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        figurinhaDoVasco pedro = new figurinhaDoVasco();
        figurinhaDoVasco figueredo = new figurinhaDoVasco();
        figurinhaDoVasco leo = new figurinhaDoVasco();

        System.out.println("olá mundo");

        pedro.name = "pedro";
        pedro.altura = 1.78f;
        pedro.nascimento = "11/01/2001";
        pedro.pais = "Brasil";
        pedro.peso = 78.0f;
        pedro.posicao = "ata";

        leo.name = "leo";
        leo.altura = 1.85f;
        leo.nascimento = "11/01/2000";
        leo.pais = "Brasil";
        leo.peso = 74.0f;
        leo.posicao = "ld";

        figueredo.name = "figueredo";
        figueredo.altura = 1.75f;
        figueredo.nascimento = "11/01/2004";
        figueredo.pais = "Brasil";
        figueredo.peso = 70.0f;
        figueredo.posicao = "mei";


    }


}