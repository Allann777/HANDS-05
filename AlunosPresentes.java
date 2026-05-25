import java.util.HashSet;

public class AlunosPresentes {
    public static void main(String[] args) {

        HashSet<String> alunos = new HashSet<>();

        alunos.add("João");
        alunos.add("Maria");
        alunos.add("Pedro");
        alunos.add("Maria");
        alunos.add("João");

        System.out.println("Lista sem repetições:");

        for (String aluno : alunos) {
            System.out.println(aluno);
        }

        System.out.println("Quantidade de alunos: " + alunos.size());
    }
}