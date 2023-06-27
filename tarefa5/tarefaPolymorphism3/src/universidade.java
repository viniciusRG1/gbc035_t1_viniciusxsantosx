public class universidade {
    private String nome;
    private String fundacao;

    Estudante [] Es = new Estudante[100];

    EstudanteMestrado estudanteMestrado1 = new EstudanteMestrado("João", "Rua A, 123", "Bacharelado em Engenharia", "Inteligência Artificial", "Mestrado", "Análise de Algoritmos");
    EstudanteMestrado estudanteMestrado2 = new EstudanteMestrado("Maria", "Rua B, 456", "Bacharelado em Ciência da Computação", "Redes de Computadores", "Mestrado", "Segurança de Redes");

    EstudanteGraduacao estudanteGraduacao1 = new EstudanteGraduacao("Pedro", "Rua C, 789", "Desenvolvimento de Software");
    EstudanteGraduacao estudanteGraduacao2 = new EstudanteGraduacao("Ana", "Rua D, 012", "Engenharia Civil");

    EstudanteDoutorado estudanteDoutorado1 = new EstudanteDoutorado("Carlos", "Rua E, 345", "Mestrado em Ciência da Computação", "Algoritmos Avançados", "Modelagem de Dados");
    EstudanteDoutorado estudanteDoutorado2 = new EstudanteDoutorado("Juliana", "Rua F, 678", "Mestrado em Biologia", "Genética Molecular", "Evolução das Espécies");

    EstudantePosGrad estudantePosGrad1 = new EstudantePosGrad("Fernando", "Rua G, 901", "Bacharelado em Administração", "Gestão de Projetos");
    EstudantePosGrad estudantePosGrad2 = new EstudantePosGrad("Carolina", "Rua H, 234", "Bacharelado em Economia", "Macroeconomia");

    public void quantosTem(Estudante [] Es){
        int grad = 0;
        int posGrad = 0;
        int doc = 0;
        int mest = 0;

        for(int t = 0; t < Es.length; t++){
            if(Es[t] instanceof EstudanteGraduacao){
                grad++;
            }else if(Es[t] instanceof EstudantePosGrad){
                posGrad++;
            }else if(Es[t] instanceof EstudanteMestrado){
                mest++;
            }else{
                doc++;
            }
        }
        System.out.println("o número de estudante de graduação é "+ grad);
        System.out.println("o número de estudante de pós graduação é "+ posGrad);
        System.out.println("o número de estudante de mestrado é "+ mest);
        System.out.println("o número de estudante de doutorado é "+ doc);
    }

    public void infoAluno(Estudante [] Es){
        for(int t = 0; t < Es.length; t++){
            if(Es[t] instanceof EstudanteDoutorado){
                ((EstudanteDoutorado) Es[t]).print();
            }else{
                Es[t].print();
            }
        }
    }

    public void infoAlunoPosGrad(Estudante [] Es){
        EstudantePosGrad [] Est = new EstudantePosGrad[100];
        int aux = 0;
        for(int t = 0; t < Es.length; t++){
            if(Es[t] instanceof EstudantePosGrad){
                Est[aux] = ((EstudantePosGrad) Es[t]);
                aux++;
            }
        }
        for(int t = 0; t < Est.length; t++){
            Est[t].print();
        }
    }
}

