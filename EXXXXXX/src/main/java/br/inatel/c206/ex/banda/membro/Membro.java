package br.inatel.c206.ex.banda.membro;

public class Membro {

    private String nome;
    private String funcao;

    public Membro(String nome, String funcao) {
        this.nome = nome;
        this.funcao = funcao;
    }

    public void apresentarSe(){
        System.out.println("Eu sou " + this.nome + " e minha função é " + this.funcao);
    }
}
