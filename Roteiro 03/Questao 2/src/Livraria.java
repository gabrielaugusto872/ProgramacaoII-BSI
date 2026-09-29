import java.util.Scanner;

public class Livraria {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Livro[] livros = new Livro[50];
        int quantidade = 0;
        int opcao;

        do {
            System.out.println("\n===== LIVRARIA =====");
            System.out.println("1 - Inserir novo livro");
            System.out.println("2 - Listar todos os livros cadastrados");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    if (quantidade < 50) {

                        System.out.print("Nome do livro: ");
                        String nome = sc.nextLine();

                        System.out.print("Autor: ");
                        String autor = sc.nextLine();

                        System.out.print("Ano: ");
                        int ano = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Descrição: ");
                        String descricao = sc.nextLine();

                        System.out.print("Preço: ");
                        int preco = sc.nextInt();
                        sc.nextLine();

                        Livro novoLivro = new Livro(
                                nome,
                                autor,
                                ano,
                                descricao,
                                preco
                        );

                        livros[quantidade] = novoLivro;
                        quantidade++;

                        System.out.println("Livro cadastrado com sucesso!");

                    } else {
                        System.out.println("Limite máximo de 50 livros atingido.");
                    }

                    break;

                case 2:
                    if (quantidade == 0) {
                        System.out.println("Nenhum livro cadastrado.");
                    } else {

                        System.out.println("\n===== LIVROS CADASTRADOS =====");

                        for (int i = 0; i < quantidade; i++) {
                            System.out.println("\nLivro " + (i + 1));
                            livros[i].mostrarDados();
                        }
                    }

                    break;

                case 3:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 3);

        sc.close();
    }
}