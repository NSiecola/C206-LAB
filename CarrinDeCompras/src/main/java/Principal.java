import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean flag  = true;
        int i = 0;

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras("Nicholas");

        carrinhoDeCompras.produtos = new Produto[100];

        while(flag){
            carrinhoDeCompras.produtos[i] = new Produto();
            System.out.println("Adicione um novo produto: ");
            carrinhoDeCompras.produtos[i].inserirProduto();
            System.out.println("Adicionar outro produto?"); // 1 - para sim | 0 - para nao
            int resp = input.nextInt();
            i++;
            input.nextLine();
            if(resp == 1)
                flag = true;
            else
                flag = false;
        }

        carrinhoDeCompras.mostraCarrin();

    }
}
