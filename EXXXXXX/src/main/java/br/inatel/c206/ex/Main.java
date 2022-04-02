package br.inatel.c206.ex;

import br.inatel.c206.ex.banda.Banda;
import br.inatel.c206.ex.banda.empresario.Empresario;
import br.inatel.c206.ex.banda.membro.Membro;
import br.inatel.c206.ex.banda.musica.Musica;

public class Main {

    public static void main(String[] args) {

        Banda b1 = new Banda("Luci-bits e amigos", "Funk");

        Membro me1 = new Membro("Jose", "cantar!");
        Membro me2 = new Membro("Pedro", "tocar batera!");
        Membro me3 = new Membro("Gabriel", " tocar baixo!");

        Musica m1 = new Musica("M1", 2.1);
        Musica m2 = new Musica("M2", 2.2);
        Musica m3 = new Musica("M3", 2.3);
        Musica m4 = new Musica("M4", 2.4);
        Musica m5 = new Musica("M5", 2.5);

        Empresario empresario = new Empresario("Pablo", 125364000);

        b1.addMembroNovo(me1);
        b1.addMembroNovo(me2);
        b1.addMembroNovo(me3);

        b1.addMusicaNova(m1);
        b1.addMusicaNova(m2);
        b1.addMusicaNova(m3);
        b1.addMusicaNova(m4);
        b1.addMusicaNova(m5);

        b1.contrataEmpresario(empresario);

        b1.mostrainfo();

    }
}
