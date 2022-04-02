package br.inatel.c206.ex.banda.musica;

public class Musica {

    private String nome;
    private double durac;

    public Musica(String nome, double durac) {
        this.nome = nome;
        this.durac = durac;
    }

    public void detalhesMusicas(){
        System.out.println("A musica é " + this.nome + " e ela dura " + this.durac + " minutos.");
    }

}
