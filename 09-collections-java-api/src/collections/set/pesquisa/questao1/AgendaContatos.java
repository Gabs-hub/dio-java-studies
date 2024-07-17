package collections.set.pesquisa.questao1;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private final Set<Contato> contatos;

    public AgendaContatos() {
        this.contatos = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatos.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatos);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> conjuntoPorNome = new HashSet<>();
        if(!contatos.isEmpty()){
            for(Contato c: contatos){
                if (c.getNome().equals(nome)){
                    conjuntoPorNome.add(c);
                }
            }
        }
        return conjuntoPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoNovo = null;
        if(!contatos.isEmpty()){
            for(Contato c: contatos){
                if (c.getNome().equals(nome)){
                    c.setNumero(novoNumero);
                    contatoNovo = c;
                }
            }
        }
        return contatoNovo;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("João", 123456789);
        agendaContatos.adicionarContato("Maria", 987654321);
        agendaContatos.adicionarContato("Maria Fernandes", 55555555);
        agendaContatos.adicionarContato("Ana", 88889999);
        agendaContatos.adicionarContato("Fernando", 77778888);
        agendaContatos.adicionarContato("Carolina", 55555555);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Maria"));

        Contato contatoAtualizado = agendaContatos.atualizarNumeroContato("Carolina", 44443333);
        System.out.println("Contato atualizado: " + contatoAtualizado);

        System.out.println("Contatos na agenda após atualização:");
        agendaContatos.exibirContatos();
    }
}
