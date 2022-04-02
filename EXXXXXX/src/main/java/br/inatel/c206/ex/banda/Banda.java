package br.inatel.c206.ex.banda;

import br.inatel.c206.ex.banda.empresario.Empresario;
import br.inatel.c206.ex.banda.membro.Membro;
import br.inatel.c206.ex.banda.musica.Musica;

public class Banda{

    private String nome;
    private String genero;


    private Membro[] membros = new Membro[10];
    private Musica[] musicas = new Musica[50];
    private Empresario empresario;

    public Banda(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    public void mostrainfo(){
        System.out.println("A banda " + this.nome + " toca músicas de " + this.genero);

        for (int i = 0; i < membros.length; i++){
            if (membros[i] != null){
                membros[i].apresentarSe();
            }
        }

        for (int i = 0; i < musicas.length; i++){
            if (musicas[i] != null){
                musicas[i].detalhesMusicas();
            }
        }

        System.out.println(this.empresario.getNome() + " é o empresário da banda! ");
        System.out.println("-----------------------------------------------------------------");
    }

    public void addMusicaNova(Musica musica){
        for (int i = 0; i < musicas.length; i++){
            if(musicas[i] == null){
                musicas[i] = musica;
                break;
            }
        }

    }

    public void addMembroNovo(Membro membro){
        for (int i = 0; i < membros.length; i++){
            if(membros[i] == null){
                membros[i] = membro;
                break;
            }
        }
    }

    public void contrataEmpresario(Empresario empresario){
        this.empresario = empresario;
    }
}
