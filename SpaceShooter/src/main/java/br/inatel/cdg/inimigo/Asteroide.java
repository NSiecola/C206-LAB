package br.inatel.cdg.inimigo;

public class Asteroide {

    private String name;
    private String tipoAsteroide;

    public Asteroide(String name, String tipoAsteroide){
        this.name = name;
        this.tipoAsteroide = tipoAsteroide;
    }

    public String getTipoAsteroide() {
        return tipoAsteroide;
    }

    public void destruir(){
        System.out.println("Asteroide " + name + " destruído!");
        System.out.println("---------------------------------------");
    }

}
