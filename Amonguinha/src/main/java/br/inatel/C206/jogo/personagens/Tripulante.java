package br.inatel.C206.jogo.personagens;

import br.inatel.C206.jogo.interfaces.Missao;

public class Tripulante extends Astronauta implements Missao {

    private int qtdMissoes =  0;

    public Tripulante(String cor, String nome) {
        super(cor, nome);
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("O tripulante completou " + qtdMissoes + " missões!");
    }

    @Override
    public void reportar() {
        System.out.println(nome + " reportou um corpo.");

    }

    @Override
    public void reparar() {
        System.out.println(nome + " fez um reparo.");

    }

    @Override
    public void fazerMissao() {
        System.out.println(nome + " fez uma missão.");
        qtdMissoes++;

    }
}
