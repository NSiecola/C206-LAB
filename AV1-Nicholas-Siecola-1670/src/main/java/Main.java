import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Time time = new Time("Timao", "Preta e branca", "Neo Quimica Arena", 30000,"Itaquera");

        boolean flag = true;

        while (flag) {
            Scanner input = new Scanner(System.in);
            System.out.println("Escolha uma das opções:");
            System.out.println("1- Adicionar jogador");
            System.out.println("2- Mostrar informações do time");
            System.out.println("3- Calcular o salario total dos jogadores do time");
            System.out.println("4- Mostra informações dos jogadores que vieram da base");
            System.out.println("5- Sair");
            int op = input.nextInt();
            input.nextLine();

            switch (op) {
                case 1:
                    Jogador j = new Jogador();
                    System.out.println("Qual o nome do jogador?");
                    j.nome = input.nextLine();
                    System.out.println("Qual o salario do jogador?");
                    j.salario = input.nextDouble();
                    System.out.println("Qual o numero da camisa do jogador?");
                    j.nCamisa = input.nextInt();
                    System.out.println("O jogador veio da base?");
                    j.base = input.nextBoolean();
                    time.adicionaJogador(j);
                    break;
                case 2:
                    time.mostraInfo();
                    break;
                case 3:
                    time.calculaTotalSalario();
                    break;
                case 4:
                    time.mostraJogadoresBase();
                    break;
                case 5:
                    flag = false;
                    break;
            }
        }
    }
}
