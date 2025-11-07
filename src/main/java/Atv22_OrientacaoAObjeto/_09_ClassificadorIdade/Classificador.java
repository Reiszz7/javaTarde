package Atv22_OrientacaoAObjeto._09_ClassificadorIdade;

public class Classificador {
    public int i;

    public String classificador() {
        String classificacao;

        if (i<=12) {
            classificacao = "Infantil";
        } else if (i<=17) {
            classificacao = "Adolescente";
        } else if (i<=64) {
            classificacao = "Adulto";
        } else
            classificacao = "Idoso";

        return classificacao;
    }
}
