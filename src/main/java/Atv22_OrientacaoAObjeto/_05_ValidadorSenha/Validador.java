package Atv22_OrientacaoAObjeto._05_ValidadorSenha;

public class Validador {
    public String senha;

    public String Validador() {
        String msg;

        if (senha.length()<8) {
            msg= "Senha deve ter no mínimo 8 caracteres";
        } else {
            boolean maiuscula= false, numero= false;

            for (int i = 0; i < senha.length(); i++) {
                if (Character.isUpperCase(senha.charAt(i))) {
                    maiuscula= true;
                } else if (Character.isDigit(senha.charAt(i))) {
                    numero= true;
                }

                if (maiuscula && numero) {
                    break;
                }
            }

            if (!maiuscula) {
                msg= "Sua senha deve conter ao menos 1 letra maiúscula";
            } else if (!numero) {
                msg= "Sua senha deve conter ao menos 1 número";
            } else
                msg= "Senha válida";
        }

        return msg;
    }
}
