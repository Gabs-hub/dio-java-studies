package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"Felps", "Gabs", "Jojs", "Tinhs", "Ivs"};
        for (String candidato: candidatos){
            entrandoEmContato(candidato);
        }
    }

    public static void imprimirSelecionados(){
        String [] candidatos = {"Felps", "Gabs", "Jojs", "Tinhs", "Ivs"};
        for (String candidato: candidatos){
            System.out.println(candidato);
        }
    }

    public static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    public static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando){
                tentativasRealizadas++;
            }else{
                System.out.println("Contato realizado com sucesso");
            }
        }while (continuarTentando&&tentativasRealizadas < 3);

        if(atendeu){
            System.out.println("Conseguimos contato com " + candidato + " na tentativa de número " + tentativasRealizadas);
        }else{
            System.out.println("Não conseguimos contato com " + candidato + ", tentativas : " + tentativasRealizadas);
        }
    }

    public static void selecaoCandidatos(){
        String [] candidatos = {"Felps", "Gabs", "Jojs", "Tinhs", "Ivs", "Jais", "Joas", "Andrs", "Kais", "Mors"};
        int candidatosSelecionados = 0;
        int posicaoAtual = 0;
        double salarioBase = 2000.00;
        while (candidatosSelecionados < 5 && posicaoAtual < candidatos.length){
            String candidato = candidatos[posicaoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + " solicitou este valor de salário: " + salarioPretendido);
            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado");
                candidatosSelecionados++;
            }
            posicaoAtual++;
        }
    }

    public static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    public static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.00;

        if (salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        }else if (salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta");
        }else{
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }
}
