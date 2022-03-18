package br.inatel.cdg.jogador;

import br.inatel.cdg.inimigo.Asteroide;
import org.jetbrains.annotations.NotNull;

public class Nave {

    private String name;
    private double life;
    private String tipoTiro;

    public Nave(String name, double life, String tipoTiro){
        this.name = name;
        this.life = life;
        this.tipoTiro = tipoTiro;
    }

    public void atirar(@NotNull Asteroide ast){
        System.out.println(name + " está atirando!");
        if(ast.getTipoAsteroide() == "Pequeno" && tipoTiro == "Normal" || tipoTiro == "Explosivo"){
            ast.destruir();
        }
        else if(ast.getTipoAsteroide() == "Grande" && tipoTiro == "Normal"){
            System.out.println("Asteroide não destruído!");
            System.out.println("---------------------------------------");
        }
        else if(ast.getTipoAsteroide() == "Grande" && tipoTiro == "Explosivo"){
            ast.destruir();
        }
    }

}
