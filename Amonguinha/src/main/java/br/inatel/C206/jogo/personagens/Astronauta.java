package br.inatel.C206.jogo.personagens;

import br.inatel.C206.jogo.customizacao.Pet;
import br.inatel.C206.jogo.customizacao.Skin;

public abstract class Astronauta {

    public static int cont = 0;

    protected String cor;
    protected String nome;

    public Skin skin;
    public Pet pet;

    public  Astronauta(String cor, String nome) {
        cont++;
        this.cor = cor;
        this.nome = nome;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void setSkin(Skin skin) {
        this.skin = skin;
    }

    public void mostraInfo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Cor: " + this.cor);

        if(this.pet != null){
            System.out.println("Pet: " + this.pet.getNome());
        }else{
            System.out.println(nome + " não possui um pet!");
        }

        if(this.skin != null){
            System.out.println("Skin: " + this.skin.getTipo());
        }else{
            System.out.println(nome + " não possui uma skin!");
        }
    }

    public void verCameras() {
        System.out.println(nome + " olhou as câmeras.");

    }

    public abstract void reportar();

    public abstract void reparar();

}
