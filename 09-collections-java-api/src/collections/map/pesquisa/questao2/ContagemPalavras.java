package collections.map.pesquisa.questao2;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private final Map<String, Integer> palavrasMap;

    public ContagemPalavras() {
        this.palavrasMap = new HashMap<>();
    }

    public void adicionarPalavras(String palavra, Integer contagem){
        palavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        if ((!palavrasMap.isEmpty())){
            palavrasMap.remove(palavra);
        }else{
            System.out.println("Não há palavras adicionadas");
        }
    }

    public String exibirContagemPalavras(){
        return palavrasMap.toString();
    }

    public String encontrarPalavrasMaisFrequente(){
        String palavraMaisFrequente = "";
        int contagem = Integer.MIN_VALUE;
        if (!palavrasMap.isEmpty()){
            for (Map.Entry<String, Integer> entry: palavrasMap.entrySet()){
                for (Integer i: palavrasMap.values()){
                    if (i.equals(entry.getValue())) {
                        palavraMaisFrequente = entry.getKey();
                        contagem = i;
                    }
                }
            }
            return palavraMaisFrequente + " = " + contagem;
        } else {
            return "Não há palavras adicionadas";
        }
    }

    public static void main(String[] args) {
        ContagemPalavras contagemLinguagens = new ContagemPalavras();

        contagemLinguagens.adicionarPalavras("Java", 2);
        contagemLinguagens.adicionarPalavras("Python", 8);
        contagemLinguagens.adicionarPalavras("JavaScript", 1);
        contagemLinguagens.adicionarPalavras("C#", 6);

        System.out.println("Existem " + contagemLinguagens.exibirContagemPalavras() + " palavras.");

        String linguagemMaisFrequente = contagemLinguagens.encontrarPalavrasMaisFrequente();
        System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
    }
}
