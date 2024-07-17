package collections.list.ordenacao.questao2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private final List<Integer> inteirosLista;

    public OrdenacaoNumeros() {
        this.inteirosLista = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        inteirosLista.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> listaOrdenada = new ArrayList<>(inteirosLista);
        if (!inteirosLista.isEmpty()){
            Collections.sort(listaOrdenada);
            return  listaOrdenada;
        }else{
            throw new RuntimeException("Lista vazia");
        }
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> listaOrdenada = new ArrayList<>(inteirosLista);
        if (!inteirosLista.isEmpty()){
            listaOrdenada.sort(Collections.reverseOrder());
            return  listaOrdenada;
        }else{
            throw new RuntimeException("Lista vazia");
        }
    }

    public void exibirNumeros() {
        if (!inteirosLista.isEmpty()) {
            System.out.println(this.inteirosLista);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);

        numeros.exibirNumeros();

        System.out.println(numeros.ordenarAscendente());
        numeros.exibirNumeros();

        System.out.println(numeros.ordenarDescendente());
        numeros.exibirNumeros();
    }
}
