import java.util.Scanner;
public class FaceFriends {

    String apelido;
    String nome;
    String email;
    String aniversário;
    String parentesco;
    String contato;
    int grau;
    int length;
    public void main(){
        Contato [] C = new Contato[5];
        this.menu(C);
    }

    public void menu(Contato [] c){
        Scanner Sc = new Scanner(System.in);
        System.out.println("1 - inserir um contato");
        System.out.println("2 - imprimir contatos");
        System.out.println("3 - fechar");
        int opc = Sc.nextInt();
        if(opc == 1){
            length = c.length;
            if(c.length < 5) {
                System.out.println("1 - contato Familia");
                System.out.println("2 - contato Amigo");
                System.out.println("3 - contato Trabalho");
                opc = Sc.nextInt();
                if(opc == 1){
                    System.out.println("escreva as informações:");
                    System.out.print("nome: ");
                    nome = Sc.nextLine();
                    System.out.println("");
                    System.out.print("apelido: ");
                    apelido = Sc.nextLine();
                    System.out.println("");
                    System.out.print("email: ");
                    email = Sc.nextLine();
                    System.out.println("");
                    System.out.print("aniversário: ");
                    aniversário = Sc.nextLine();
                    System.out.println("");
                    System.out.print("parentesco: ");
                    parentesco = Sc.nextLine();
                    System.out.println("");
                    c[length] = new Familia(nome, apelido, email, aniversário, parentesco);
                }else if(opc == 2){
                    System.out.println("escreva as informações:");
                    System.out.print("nome: ");
                    nome = Sc.nextLine();
                    System.out.println("");
                    System.out.print("apelido: ");
                    apelido = Sc.nextLine();
                    System.out.println("");
                    System.out.print("email: ");
                    email = Sc.nextLine();
                    System.out.println("");
                    System.out.print("aniversário: ");
                    aniversário = Sc.nextLine();
                    System.out.println("");
                    System.out.print("grau: ");
                    grau = Sc.nextInt();
                    System.out.println("");
                    c[length] = new Amigo(nome, apelido, email, aniversário, grau);
                }else if(opc == 3){
                    System.out.println("escreva as informações:");
                    System.out.print("nome: ");
                    nome = Sc.nextLine();
                    System.out.println("");
                    System.out.print("apelido: ");
                    apelido = Sc.nextLine();
                    System.out.println("");
                    System.out.print("email: ");
                    email = Sc.nextLine();
                    System.out.println("");
                    System.out.print("aniversário: ");
                    aniversário = Sc.nextLine();
                    System.out.println("");
                    System.out.print("grau: ");
                    grau = Sc.nextInt();
                    System.out.println("");
                    System.out.print("contato: ");
                    contato = Sc.nextLine();
                    System.out.println("");
                    c[length] = new Trabalho(nome, apelido, email, aniversário, contato, grau);
                }else{
                    System.out.println("opção invalida");
                }

            }else{
                System.out.println("sua fila está cheia");
            }
            this.menu(c);
        }else if(opc == 2){
            System.out.println("1 - imprimir todos os contatos");
            System.out.println("2 - imprimir somente os familiares");
            System.out.println("3 - imprimir somente os amigos");
            System.out.println("4 - imprimir somente os colegas de trabalho");
            System.out.println("5 - imprimir somente os MELHORES amigos, IRMÃOS e COLEGAS DE TRABALHO");
            System.out.println("6 - imprimir um contato específico");
            opc = Sc.nextInt();
            if(opc == 1){
                 for(int t = 0; t < c.length; t++){
                     c[t].ImprimirContato();
                 }
                 this.menu(c);
            }else if(opc == 2){
                for(int t = 0; t < c.length; t++){
                    if(c[t] instanceof Familia){
                        c[t].ImprimirContato();
                    }
                }
                this.menu(c);
            }else if(opc == 3){
                for(int t = 0; t < c.length; t++){
                    if(c[t] instanceof Amigo){
                        c[t].ImprimirContato();
                    }
                }
                this.menu(c);
            }else if(opc == 4){
                for(int t = 0; t < c.length; t++){
                    if(c[t] instanceof Trabalho){
                        c[t].ImprimirContato();
                    }
                }
            }else if(opc == 5){
                for(int t = 0; t < c.length; t++){
                    if(c[t] instanceof Amigo){
                        if(((Amigo) c[t]).getGrau() == 1){
                            c[t].ImprimirContato();
                        }else if(c[t] instanceof Familia){
                            if(((Familia)c[t]).getParentesco().equals("irmão")){
                                c[t].ImprimirContato();
                            }
                        }else if(c[t] instanceof Trabalho){
                            if(((Trabalho)c[t]).grauDeAfinidade().equals("colega")){
                                c[t].ImprimirContato();
                            }
                        }
                    }
                }
            }else if(opc == 6){
                System.out.println("escolha o contato que você quer");
                opc = Sc.nextInt();
                if(c[opc] instanceof Amigo){
                    ((Amigo)c[opc]).imprimirContato();
                }else if(c[opc] instanceof Familia){
                    ((Familia)c[opc]).imprimirContato();
                }else{
                    ((Trabalho)c[opc]).imprimirContato();
                }
            }
            this.menu(c);
        }else{
            return;
        }

    }

}
