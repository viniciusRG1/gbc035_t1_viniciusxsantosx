import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContaCorrente [] CC = new ContaEspecial[2];
        float val;
        int num;
        int pwd;
        float lim;
        Scanner Sc = new Scanner(System.in);
        val = Sc.nextFloat();
        num = Sc.nextInt();
        pwd = Sc.nextInt();
        lim = Sc.nextFloat();

        if(lim <= 0){
            CC[1] = new ContaComum(val, num, pwd);
        }else{
            CC[1] = new ContaEspecial(val, num, pwd, lim);
        }
        val = Sc.nextFloat();
        num = Sc.nextInt();
        pwd = Sc.nextInt();
        lim = Sc.nextFloat();

        if(lim <= 0){
            CC[0] = new ContaComum(val, num, pwd);
        }else{
            CC[0] = new ContaEspecial(val, num, pwd, lim);
        }


    }
}