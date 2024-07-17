package collections.set.ordenacao.questao2;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media){
        alunoSet.add(new Aluno(nome,matricula,media));
    }

    public void removerAlunoPorMatricula(long matricula){
        if(!alunoSet.isEmpty()){
            alunoSet.removeIf(a -> a.getMatricula() == matricula);
        }else{
            System.out.println("Conjunto vazio");
        }
    }

    public void exibirAlunosPorNome(){
        new TreeSet<>(alunoSet);
        System.out.println(alunoSet);
    }

    public void exibirAlunosPorNota(){
        Set<Aluno> alunosPorNome = new TreeSet<>(new ComparatorPorNota().reversed());
        alunosPorNome.addAll(alunoSet);
        System.out.println(alunosPorNome);
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("João", 123456L, 10.0);
        gerenciadorAlunos.adicionarAluno("Maria", 123457L, 9.0);
        gerenciadorAlunos.adicionarAluno("Carlos", 123458L, 5.0);
        gerenciadorAlunos.adicionarAluno("Ana", 123459L, 6.8);

        System.out.println("Alunos no gerenciador:");
        System.out.println(gerenciadorAlunos.alunoSet);

        gerenciadorAlunos.removerAlunoPorMatricula(0L);
        gerenciadorAlunos.removerAlunoPorMatricula(123457L);
        System.out.println(gerenciadorAlunos.alunoSet);

        gerenciadorAlunos.exibirAlunosPorNome();

        gerenciadorAlunos.exibirAlunosPorNota();
    }
}
