package Atv22_OrientacaoAObjeto._07_NumeroPrimo;

public class VerificadorPrimo {
    public int n;

    public String verificador() {
        String msg;
        boolean primo=false;

        if (n==2) {
            primo= true;
        } else {
            for (int i=2; i<n; i++) {
                if (n%i==0) {
                    primo= false;
                    break;
                } else
                    primo= true;
            }
        }

        if (primo) {
            msg= " É primo";
        } else
            msg= " Não é primo";

        return msg;
    }
}
