package Atv22_OrientacaoAObjeto._06_CalculadoraMedia;

public class Media {
    public int n;
    public double soma=0;

    public double media() {
        if (soma == 0) {
            return 0;
        } else
            return soma/n;
    }
}
