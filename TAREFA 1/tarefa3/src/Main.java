import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numeros = new int[6];
        numeros[0] = sc.nextInt();
        numeros[1] = sc.nextInt();
        numeros[2] = sc.nextInt();
        numeros[3] = sc.nextInt();
        numeros[4] = sc.nextInt();
        numeros[5] = sc.nextInt();

        System.out.println("os valores são"+numeros[1]+numeros[2]+numeros[3]+numeros[4]+numeros[5]);

        for(int t = 0; t < 6; t++){
            numeros[t] = sc.nextInt();
        }
        for(int t = 0; t < 6; t++){
            System.out.println("o valor da posição"+(t+1)+":"+numeros[t]);
        }

        for(int t = 5; t > -1; t--){
            System.out.println("o valor da posição"+(t+1)+":"+numeros[t]);
        }

        int t = 0;

        while(t != 6){
            numeros[t] = sc.nextInt();
            if(numeros[t] % 2 == 1){
                System.out.println("número invalido");
            }else{
                t++;
            }
        }

        int r = 0;

        for(t = 0; t < 6; t++){
            numeros[t] = sc.nextInt();
        }
        for(t = 0; t < 6; t++){
            System.out.println(numeros[t]);
        }
        t = 0;

        while(t < 5){
            r = maior(numeros[t], numeros[t+1]);
            if(t == 5){
                System.out.println(r);
                break;
            }else{
                t++;
            }
        }
        int [] alunoo = new int[5];
        for(int tt = 0; tt < 5; tt++){
            alunoo[tt] = sc.nextInt();
        }
        for(int tt = 0; tt < 5; tt++){
            alunoo[tt] = normalizar(alunoo[tt]);
        }
        for(int tt = 0; tt < 5; tt++){
            System.out.println(alunoo[tt]);
        }

        int [] media = new int[5];

        int tes = 0;

        for(int tt = 0; tt < 5; tt++){
            media[tt] = sc.nextInt();
            tes = tes + media[tt];
        }

        System.out.println(medias(tes));

        float aux = medias(tes);

        float auxx = 0;

        for(int tt = 0; tt < 5; tt++){
            auxx = auxx + ((media[tt]-aux)*(media[tt]-aux));
        }

        System.out.println(desvioPadrao(auxx));

        System.out.println("entre com o número de aluns");

        t = 101;

        while(t > 100){
            t = sc.nextInt();
            if(t > 100){
                System.out.println("o número maior que o permitido, por favor tente novamente");
            }
        }


        int [] alunos = new int[t];

        for(int tt = 0; tt < t; tt++){
            alunos[tt] = sc.nextInt();
        }
        tes = 0;
        for(int tt = 0; tt < t; tt++){
            System.out.println("a nota do aluno "+tt+"é"+alunos[tt]);
            tes = tes + alunos[tt];
        }

        System.out.println(medias(tes, t));

        int [] A = new int[3];

        int [] B = new int[3];

        int [] C = new int[3];

        for(int tt = 0; tt < 3; tt++){
            A[tt] = sc.nextInt();
            B[tt] = sc.nextInt();
            C[tt] = A[tt] - B[tt];
        }

        for(int tt= 0; tt < 3; tt++){
            System.out.println(C[tt]);
        }

        int [] valores = new int[5];
        int [] par = new int[5];
        int [] impar = new int[5];

        int tImpar = 0;
        int tPar = 0;

        for(int tt = 0; tt < 5; tt++){
            valores[tt] = sc.nextInt();
            if(valores[tt] % 2 == 1){
                impar[tImpar] = valores[tt];
                tImpar++;
            }else{
                par[tPar] = valores[tt];
                tPar++;
            }
        }

        for(int tt = 0; tt < 5; tt++){
            valores[tt] = sc.nextInt();
            if(valores[tt] > 0 ){
                continue;
            }else{
                valores[tt]= 0;
            }
        }

        t = 0;
        t = sc.nextInt();

        String classeSocial;

        String nome = "";

        float CRA = 0;
        aluno [] alunos2 = new aluno[t];
        for(int tt = 0; tt < t; tt++){
            CRA = sc.nextFloat();
            alunos2[tt].setCRA(CRA);
            clearBuffer(sc);
            nome = sc.nextLine();
            alunos2[tt].setNome(nome);
            clearBuffer(sc);
            classeSocial = sc.nextLine();
            alunos2[tt].setClasseSocial(classeSocial);
        }


    }

    private static float desvioPadrao(float media){

        media = media/(5-1);

        return media;
    }
    private static float medias(int total){

        return total/5;
    }

    private static float medias(int total, int divisor){
        return total/divisor;
    }
    private static int maior(int a, int b) {
        if(a > b){
            return a;
        }else{
            return b;
        }
    }

    private static int normalizar(int a){
        return a*2;
    }

    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }

}