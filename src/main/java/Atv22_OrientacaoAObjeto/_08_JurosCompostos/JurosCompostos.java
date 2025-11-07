package Atv22_OrientacaoAObjeto._08_JurosCompostos;

public class JurosCompostos {
    public double c;
    public double i;
    public int t;

    public double juros() {
        double montante= c;
        i/=100;

        while (t>0) {
            double juros = montante*i;
            montante+=juros;
            t--;
        }

        return montante;
    }
}
