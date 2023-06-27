public class Classificador {
    public void ordena(Classificavel[] a){
        Classificavel elem, menor;
        int pos;
        for(int i = 0; i < a.length; i++){
            elem = a[i];
            menor = a[i + 1];
            pos = i + 1;
            for(int j = i + 2; j < a.length; j++){
                if(a[j].eMenorQue((elem))){
                    a[i] = a[pos];
                    a[pos] = elem;
                }
            }
        }
    }
}
