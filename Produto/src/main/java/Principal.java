public class Principal {

    public static void main(String[] args) {

        Produto p1 = new Produto(123, "ab5", "banana", "comida", 50);
        Produto p2 = new Produto(456, "jk7", "dvd", "diversao", 999);

        p1.mostraInfo();
        p2.mostraInfo();

    }

}
