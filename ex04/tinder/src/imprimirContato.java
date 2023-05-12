public abstract class imprimirContato {
    public void imprimirBasico(contato CE){
        System.out.println(CE.getAniversario()+CE.getApelido()+CE.getEmail()+CE.getNome());
    }
}
