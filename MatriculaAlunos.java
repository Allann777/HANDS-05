import java.util.HashMap;

public class CadastroAlunos {
    public static void main(String[] args) {

        HashMap<Integer, String> alunos = new HashMap<>();

        // Cadastro
        alunos.put(101, "Carlos");
        alunos.put(102, "Ana");
        alunos.put(103, "Fernanda");

        // Buscar aluno
        int matriculaBusca = 102;

        if (alunos.containsKey(matriculaBusca)) {
            System.out.println("Aluno encontrado: " + alunos.get(matriculaBusca));
        } else {
            System.out.println("Aluno não encontrado.");
        }

        // Remover aluno
        alunos.remove(101);

        // Mostrar todos
        System.out.println("\nLista de alunos:");

        for (Integer matricula : alunos.keySet()) {
            System.out.println(matricula + " - " + alunos.get(matricula));
        }
    }
}