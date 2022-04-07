package br.inatel.C206.jogo;

import br.inatel.C206.jogo.customizacao.Pet;
import br.inatel.C206.jogo.customizacao.Skin;
import br.inatel.C206.jogo.personagens.Astronauta;
import br.inatel.C206.jogo.personagens.Impostor;
import br.inatel.C206.jogo.personagens.Tripulante;

public class Main {

    public static void main(String[] args) {

        Impostor imp1 = new Impostor("Preto", "Pedroka");
        Tripulante tp1 = new Tripulante("Vermelho", "Pig");

        Astronauta astronautas[] = new Astronauta[20];

        astronautas[0] = imp1;
        astronautas[1] = tp1;

        Skin skin1 = new Skin("Twisted fate!");
        Skin skin2 = new Skin("Nidalee!");

        Pet pet1 = new Pet("Dragão!");
        Pet pet2 = new Pet("Barão!");

        imp1.setPet(pet1);
        imp1.setSkin(skin1);

        tp1.setPet(pet2);
        tp1.setSkin(skin2);

        for (int i = 0; i < astronautas.length; i++){

            if (astronautas[i] instanceof Impostor){
                Impostor impostor = (Impostor) astronautas[i];

                impostor.executar();
                impostor.fazerMissao();
                impostor.reparar();
                impostor.reportar();
                impostor.sabotarComunicacao();
                impostor.sabotarLuz();
                impostor.sabotarOxigenio();
                impostor.sabotarReator();
                impostor.trancarPortas("Cantina!");
                impostor.usarVentoinha();
                impostor.verCameras();
                System.out.println("-------------------------------------------------");
                impostor.mostraInfo();
            }

            if (astronautas[i] instanceof Tripulante){
                Tripulante tripulante = (Tripulante) astronautas[i];

                tripulante.fazerMissao();
                tripulante.reparar();
                tripulante.reportar();
                tripulante.verCameras();
                System.out.println("-------------------------------------------------");
                tripulante.mostraInfo();
            }
        }

    }
}
