package Atv22_OrientacaoAObjeto._04_CalculadoraFatorial;

public class Calculo {
    public int n;

    public int fatorial() {
        int n2= n-1;
        int n3= n*n2;

        while(n2!=1){
            n2-=1;
            n3*=n2;
        }

        return n3;
    }
}
