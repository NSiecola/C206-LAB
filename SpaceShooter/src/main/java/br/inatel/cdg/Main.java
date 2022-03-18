package br.inatel.cdg;

import br.inatel.cdg.inimigo.Asteroide;
import br.inatel.cdg.jogador.Nave;

public class Main {

    public static void main(String[] args) {

        Asteroide ast1 = new Asteroide("Pig", "Grande");
        Asteroide ast2 = new Asteroide("Gui", "Pequeno");

        Nave nave1 = new Nave("Corinthians", 10000, "Explosivo");
        Nave nave2 = new Nave("Galo", 5000, "Normal");

        nave1.atirar(ast1);
        nave1.atirar(ast2);

        nave2.atirar(ast1);
        nave2.atirar(ast2);
    }

}
