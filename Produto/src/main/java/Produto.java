public class Produto {

    int codigoSerie;
    String codigoProduto;
    String nome;
    String categoria;
    int quantidade;

    Produto(int codigoSerie, String codigoProduto, String nome, String categoria, int quantidade){
        this.codigoSerie = codigoSerie;
        this.codigoProduto = codigoProduto;
        this.nome =  nome;
        this.categoria = categoria;
        this.quantidade = quantidade;
    }

    void mostraInfo(){
        System.out.println(codigoSerie);
        System.out.println(codigoProduto);
        System.out.println(nome);
        System.out.println(categoria);
        System.out.println(quantidade);

    }
}
