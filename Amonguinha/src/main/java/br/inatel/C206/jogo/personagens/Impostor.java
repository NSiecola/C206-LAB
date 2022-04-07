package br.inatel.C206.jogo.personagens;

import br.inatel.C206.jogo.interfaces.Executar;
import br.inatel.C206.jogo.interfaces.Missao;
import br.inatel.C206.jogo.interfaces.Sabotar;

public class Impostor extends Astronauta implements Missao, Sabotar, Executar {

    private int qtdMortes  = 0;

    public Impostor(String cor, String nome) {
        super(cor, nome);
    }

    public void usarVentoinha(){
        System.out.println("O impostor se escondeu na ventilação!");
    }

    public void trancarPortas(String local){
        System.out.println("O impostor trancou as portas do(a) " + local);
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("O impostor matou: " + qtdMortes);
    }

    @Override
    public void reportar() {
        System.out.println(nome + " fez um self report.");
    }

    @Override
    public void reparar() {
        System.out.println(nome + " fingiu que fez um reparo.");
    }

    @Override
    public void fazerMissao() {
        System.out.println(nome + " fez uma tarefa falsa.");
    }

    @Override
    public void sabotarLuz() {
        System.out.println("O impostor sabotou a luz!");
    }

    @Override
    public void sabotarOxigenio() {
        System.out.println("O impostor sabotou o oxigênio!");
    }

    @Override
    public void sabotarReator() {
        System.out.println("O impostor sabotou o reator!");
    }

    @Override
    public void sabotarComunicacao() {
        System.out.println("O impostor sabotou a comunicação!");
    }

    @Override
    public void executar() {
        System.out.println(nome + " matou um tripulante!");
        qtdMortes++;
    }

}
