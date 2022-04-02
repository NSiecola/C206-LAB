package br.inatel.c206.ex.banda.empresario;

public class Empresario {

    private String nome;
    private long cnpj;

    public Empresario(String nome, long cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }
}
