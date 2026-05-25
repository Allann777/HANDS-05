import java.util.LinkedList;
import java.util.Queue;

public class FilaClientes {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        fila.add("Cliente 1");
        fila.add("Cliente 2");
        fila.add("Cliente 3");
        fila.add("Cliente 4");
        fila.add("Cliente 5");

        System.out.println("Próximo cliente: " + fila.peek());

        // Atender 2 clientes
        fila.poll();
        fila.poll();

        System.out.println("\nFila atualizada:");

        for (String cliente : fila) {
            System.out.println(cliente);
        }
    }
}
