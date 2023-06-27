import java.util.Scanner;
public class UsaBanco {

    Scanner Sc = new Scanner(System.in);
    public void sacar(ContaCorrente CC){
        int pwd = Sc.nextInt();
        float val = Sc.nextFloat();
        if(CC.isSenha(pwd) == true){
            CC.debitaValor(val, pwd);
        }else{
            return;
        }
    }

    public void depositar(ContaCorrente CC){
        int pwd = Sc.nextInt();
        float val = Sc.nextFloat();
        CC.creditaValor(pwd, val);
    }
}
