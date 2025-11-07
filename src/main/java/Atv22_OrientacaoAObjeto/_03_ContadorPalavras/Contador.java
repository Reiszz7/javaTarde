package Atv22_OrientacaoAObjeto._03_ContadorPalavras;

public class Contador {
    public String frase;

    public int contador() {
        String[] palavras= frase.trim().split("[\\s!,?]+");
        return palavras.length;
    }
}
