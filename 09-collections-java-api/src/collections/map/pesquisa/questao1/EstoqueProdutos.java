package collections.map.pesquisa.questao1;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private final Map<Long, Produto> produtoMap;

    public EstoqueProdutos() {
        this.produtoMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        produtoMap.put(cod, new Produto(cod,nome,quantidade,preco));
    }

    public void exibirProdutos(){
        System.out.println(produtoMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotal = 0;
        if(!produtoMap.isEmpty()) {
            for (Produto p : produtoMap.values()) {
                valorTotal += p.getPreco() * p.getQuantidade();
            }
        }
        return valorTotal;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!produtoMap.isEmpty()) {
            for (Produto p : produtoMap.values()) {
                if (p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                    maiorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MAX_VALUE;
        if(!produtoMap.isEmpty()) {
            for (Produto p : produtoMap.values()) {
                if (p.getPreco() < maiorPreco){
                    produtoMaisCaro = p;
                    maiorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto produto = null;
        double maiorValorTotal = 0;
        if (!produtoMap.isEmpty()){
            for (Produto p: produtoMap.values()){
                if ((p.getPreco() * p.getQuantidade()) > maiorValorTotal){
                    produto = p;
                    maiorValorTotal = p.getPreco() * p.getQuantidade();
                }
            }
        }
        return produto;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.exibirProdutos();

        estoque.adicionarProduto(1L, "Notebook", 1, 1500.0);
        estoque.adicionarProduto(2L, "Mouse", 5, 25.0);
        estoque.adicionarProduto(3L, "Monitor", 10, 400.0);
        estoque.adicionarProduto(4L, "Teclado", 2, 40.0);

        estoque.exibirProdutos();

        System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());

        Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
        System.out.println("Produto mais caro: " + produtoMaisCaro);

        Produto produtoMaisBarato = estoque.obterProdutoMaisBarato();
        System.out.println("Produto mais barato: " + produtoMaisBarato);

        Produto produtoMaiorQuantidadeValorTotal = estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
        System.out.println("Produto com maior quantidade em valor no estoque: " + produtoMaiorQuantidadeValorTotal);
    }
}
