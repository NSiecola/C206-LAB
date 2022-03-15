public class Time {

    String nome;
    String corCamisa;
    Jogador[] jogadores = new Jogador[30];
    Estadio estadio;
    double total = 0;


    Time(String nome, String corCamisa, String nomeEstadio, int capacidade, String cidade){
        this.nome = nome;
        this.corCamisa = corCamisa;
        estadio = new Estadio(nomeEstadio, capacidade, cidade);
    }


    void mostraInfo(){
        System.out.println("Nome do time: " + nome);
        System.out.println("Cor da camisa do time: " + corCamisa);
        System.out.println("Estadio do time: " + estadio.nome);
        System.out.println("Capacidade do estadio do time: " + estadio.capacidade);
        System.out.println("Cidade do estadio do time: " + estadio.cidade);
        System.out.println("Jogadores do time:");
        for (int i = 0; i < jogadores.length; i++){
            if(jogadores[i] != null){
                jogadores[i].mostraInfo();
            }
        }
    }

    void adicionaJogador(Jogador jogador){
        for(int i = 0; i < jogadores.length; i++){
            if(jogadores[i] == null) {
                jogadores[i] = jogador;
                break;
            }
        }
    }

    double calculaTotalSalario(){
        for (int i = 0; i < jogadores.length; i++){
            if(jogadores[i] != null){
                total += jogadores[i].salario;
            }
        }
        System.out.println("Salario total:" + total);
        return total = 0;
    }

    void mostraJogadoresBase(){
        for (int i = 0; i < jogadores.length; i++){
            if(jogadores[i] != null){
                if(jogadores[i].base == true){
                    System.out.println("Nome do jogador: " + jogadores[i].nome);
                    System.out.println("Salario do jogador: " + jogadores[i].salario);
                    System.out.println("Numero da camisa do jogador: " + jogadores[i].nCamisa);
                    System.out.println("Jogador da base? " + jogadores[i].base);
                }
            }
        }
    }


}
