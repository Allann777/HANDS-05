import java.util.ArrayList;

public class ListaCompras {
    public static void main(String[] args) {

        ArrayList<String> produtos = new ArrayList<>();

        produtos.add("Arroz");
        produtos.add("Feijão");
        produtos.add("Leite");
        produtos.add("Macarrão");
        produtos.add("Café");

        System.out.println("Produtos cadastrados:");

        for (String produto : produtos) {
            System.out.println(produto);
        }

        System.out.println("Quantidade total: " + produtos.size());
    }
}