package edu.gabs.segundasemana;

public class MinhaClasse {
    public static void main(String[] args) {
        String primeiroNome = "Gabs";
        String segundoNome = "Lima";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

public static String nomeCompleto(String nome1, String nome2){
    return nome1.concat(" ").concat(nome2);
}

}
