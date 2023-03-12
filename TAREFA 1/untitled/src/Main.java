import java.util.Scanner;
public class Main {


    public static void main(String[] args) {

        String [] nome = new String[4];
        float [] preco = new float[4];
        int [] qtsEstoque = new int[4];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 4; i++)
        {
            System.out.println("\nInforme o nome, o preco e a qtd. em estoque do produto:"+i);
            nome[i] = sc.nextLine();
            preco[i] = sc.nextFloat();
            qtsEstoque[i] = sc.nextInt();
            clearBuffer(sc);

        }


        System.out.println("\nAumentando o preco em 10%% do produto 1 e 3");
        preco[0] = altera_preco(preco[0],-110);
        preco[2] = altera_preco(preco[2],10);

        System.out.println("\nReduzindo o preco em 5%% do produto 2");
        if (altera_preco(preco[1],-5)==-1){

            System.out.println("\n\nErro: preco nao alterado. Porcentagem invalida\n");
        }else System.out.println("\n\n Preco alterado com sucesso");
            altera_preco(preco[1],-5);

        System.out.println("\nAlterando o preco do prod. 3");
        if (altera_preco(preco[3],-110) == -1)
            System.out.println("\n\nErro: preco nao alterado. Porcentagem invalida\n");

        System.out.println("\nProdutos Cadastrados:\n");
        for (int i = 0; i < 4; i++){
            System.out.println("Produto:"+nome[i]+" Preco:"+preco[i]+" Estoque:"+qtsEstoque[i]);
        }
    }

    private static float altera_preco(float preco, int porcentagem) {

            float temp;
            if (porcentagem > -100) {
                temp = 1 + porcentagem / 100; // 10 >>> 1 + 10/100 = 1.1  ;; -5  =>> 1 + (-5/100) 0.95
                preco = preco * temp;  // preço modificado
                return preco;
            } else {
                return -1;
            }

    }
    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }

}