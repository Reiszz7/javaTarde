package Atv22_OrientacaoAObjeto._02_ConversorTemperatura;

public class Conversor {
    public double c;
    public double f;

    public double celsiusFarenheit() {
        double conversao= (c*1.8)+32;
        return conversao;
    }

    public double farenheitCelsius() {
        double conversao= 5/9*(f-32);
        return conversao;
    }
}
