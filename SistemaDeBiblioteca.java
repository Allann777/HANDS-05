import java.util.ArrayList;
import java.util.Scanner;

class Livro {

    int codigo;
    String titulo;
    String autor;
    boolean disponivel;

    public Livro(int codigo, String titulo, String autor) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }
}

public class Biblioteca {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Livro> livros = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n1 - Cadastrar livro");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Emprestar livro");
            System.out.println("4 - Devolver livro");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:

                    System.out.print("Código: ");
                    int codigo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Título: ");
                    String titulo = sc.nextLine();

                    System.out.print("Autor: ");
                    String autor = sc.nextLine();

                    livros.add(new Livro(codigo, titulo, autor));

                    System.out.println("Livro cadastrado!");
                    break;

                case 2:

                    for (Livro l : livros) {
                        System.out.println(
                                l.codigo + " - " +
                                l.titulo + " - " +
                                l.autor + " - " +
                                (l.disponivel ? "Disponível" : "Indisponível")
                        );
                    }

                    break;

                case 3:

                    System.out.print("Código do livro: ");
                    int codEmprestimo = sc.nextInt();

                    for (Livro l : livros) {

                        if (l.codigo == codEmprestimo) {

                            if (l.disponivel) {
                                l.disponivel = false;
                                System.out.println("Livro emprestado!");
                            } else {
                                System.out.println("Livro indisponível.");
                            }
                        }
                    }

                    break;

                case 4:

                    System.out.print("Código do livro: ");
                    int codDevolucao = sc.nextInt();

                    for (Livro l : livros) {

                        if (l.codigo == codDevolucao) {
                            l.disponivel = true;
                            System.out.println("Livro devolvido!");
                        }
                    }

                    break;
            }

        } while (opcao != 0);

        sc.close();
    }
}