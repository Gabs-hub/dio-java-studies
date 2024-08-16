package collections.list.pesquisa.questao2;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> inteirosLista;

    public SomaNumeros() {
        this.inteirosLista = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        inteirosLista.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;

        if(!inteirosLista.isEmpty()){
            for (int i: inteirosLista){
                soma += i;
            }
        }
        return  soma;
    }

    public int encontrarMaiorNumero(){
        int maior = 0;

        if(!inteirosLista.isEmpty()){
            for (int i: inteirosLista){
                if(i > maior){
                    maior = i;
                }
            }
        }
        return maior;
    }

    public int encontrarMenorNumero(){
        int menor = 0;

        if(!inteirosLista.isEmpty()){
            for (int i: inteirosLista){
                if(i < menor){
                    menor = i;
                }
            }
        }
        return menor;
    }

    public String exibirNumeros(){
        String numeros = "";

        if(!inteirosLista.isEmpty()){
            for (int i: inteirosLista){
                numeros = numeros + i + " ";
            }
        }
        return numeros;
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(10);

        System.out.println("Números adicionados: " + somaNumeros.exibirNumeros());

        System.out.println("Soma dos números = " + somaNumeros.calcularSoma());

        System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());

        System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());
    }
}
