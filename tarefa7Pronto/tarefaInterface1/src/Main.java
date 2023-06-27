import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Cliente [] Cl = new Cliente[2];
        Produto [] Pr = new Produto[2];
        Serviço [] Sr = new Serviço[2];

        Scanner Sc = new Scanner(System.in);
        String nome = Sc.nextLine();
        Cl[0] = new Cliente(nome);
        int codigo = Sc.nextInt();
        Pr[0] = new Produto(codigo);
        float val = Sc.nextFloat();
        Sr[0] = new Serviço(val);
        nome = Sc.nextLine();
        Cl[1] = new Cliente(nome);
        codigo = Sc.nextInt();
        Pr[1] = new Produto(codigo);
        val = Sc.nextFloat();
        Sr[1] = new Serviço(val);


        System.out.println(Cl[1].eMenorQue(Cl[2]));
        System.out.println(Pr[1].eMenorQue(Pr[2]));
        System.out.println(Sr[1].eMenorQue((Sr[2])));

        System.out.println(Cl[1].getNome());
        System.out.println(Cl[2].getNome());
        System.out.println(Pr[1].getCodigo());
        System.out.println(Pr[2].getCodigo());
        System.out.println(Sr[1].getPreco());
        System.out.println(Sr[2].getPreco());
    }
}