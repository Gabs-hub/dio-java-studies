package collections.map.ordenacao.questao2;

import java.util.*;

public class LivrariaOnline {
    private final Map<String, Livro> livroMap;

    public LivrariaOnline() {
        this.livroMap = new HashMap<>();
    }

    public void adicionarLivro(String link, Livro l){
        livroMap.put(link, l);
    }

    public void removerLivro(String titulo){
        if (!livroMap.isEmpty()){
            livroMap.entrySet().removeIf(entry -> entry.getValue().getTitulo().equals(titulo));
        } else {
            System.out.println("Mapa vazio");
        }
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorPreco(){
        List<Map.Entry<String, Livro>> listaDeLivros = new ArrayList<>(livroMap.entrySet());
        listaDeLivros.sort(Comparator.comparing(entry -> entry.getValue().getPreco()));

        Map<String, Livro> livrosOrdenados = new LinkedHashMap<>();
        for (Map.Entry<String, Livro> entry : listaDeLivros) {
            livrosOrdenados.put(entry.getKey(), entry.getValue());
        }

        return livrosOrdenados;
    }

    public void pesquisarLivrosPorAutor(String autor){
        Map<String, Livro> livrosDoAutor = new HashMap<>();
        if (!livroMap.isEmpty()){
            for (Map.Entry<String, Livro> entry: livroMap.entrySet()){
                if (entry.getValue().getAutor().equals(autor)){
                    livrosDoAutor.put(entry.getKey(), entry.getValue());
                }
            }
            System.out.println(livrosDoAutor);
        }
    }

    public Livro obterLivroMaisCaro(){
        Livro livro = null;
        double valor = Double.MIN_VALUE;
        if (!livroMap.isEmpty()){
            for (Livro l: livroMap.values()){
                if (l.getPreco() > valor){
                    valor = l.getPreco();
                    livro = l;
                }
            }
        }
        return livro;
    }

    public Livro obterLivroMaisBarato(){
        Livro livro = null;
        double valor = Double.MAX_VALUE;
        if (!livroMap.isEmpty()){
            for (Livro l: livroMap.values()){
                if (l.getPreco() < valor){
                    valor = l.getPreco();
                    livro = l;
                }
            }
        }
        return livro;
    }

    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();

        livrariaOnline.adicionarLivro("https://amzn.to/3EclT8Z", new Livro("1984", "George Orwell", 50d));
        livrariaOnline.adicionarLivro("https://amzn.to/47Umiun", new Livro("A Revolução dos Bichos", "George Orwell", 7.05d));
        livrariaOnline.adicionarLivro("https://amzn.to/3L1FFI6", new Livro("Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d));
        livrariaOnline.adicionarLivro("https://amzn.to/3OYb9jk", new Livro("Malorie", "Josh Malerman", 5d));
        livrariaOnline.adicionarLivro("https://amzn.to/45HQE1L", new Livro("E Não Sobrou Nenhum", "Agatha Christie", 50d));
        livrariaOnline.adicionarLivro("https://amzn.to/45u86q4", new Livro("Assassinato no Expresso do Oriente", "Agatha Christie", 5d));

        System.out.println("Livros ordenados por preço: \n" + livrariaOnline.exibirLivrosOrdenadosPorPreco());

        String autorPesquisa = "Josh Malerman";
        livrariaOnline.pesquisarLivrosPorAutor(autorPesquisa);

        System.out.println("Livro mais caro: " + livrariaOnline.obterLivroMaisCaro());

        System.out.println("Livro mais barato: " + livrariaOnline.obterLivroMaisBarato());

        livrariaOnline.removerLivro("1984");
        System.out.println(livrariaOnline.livroMap);

    }
}
