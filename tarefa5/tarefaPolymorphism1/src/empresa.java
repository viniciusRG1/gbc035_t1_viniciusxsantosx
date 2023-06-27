public class empresa {
    public void main(){
        funcionario [] fn = new funcionario[4];
        fn[0] = new chefe("vinicius", "11/01/2001", 5700f);
        fn[1] = new vendedor("cazé", "12/02/2002", 1500f, 1000);
        fn[2] = new operario("garcia", "13/03/2003", 3.5f, 1000);
        fn[3] = new horista("resende", "14/04/2004", 10f, 2000);

        folhaDePagamento FDP = new folhaDePagamento();
        FDP.pagamentos(fn);
    }
}
