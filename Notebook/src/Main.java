import java.sql.SQLOutput;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<Tarefa> tarefas = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n===== LIVRARIA =====");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Listar tarefas");
            System.out.println("3 - Filtrar tarefas");
            System.out.println("4 - Remover tarefas");
            System.out.println("5 - Concluir tarefas");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1:
                    adicionarTarefa();
                    break;

                case 2:
                    // listar tarefas
                    break;

                case 3:
                    // filtrar tarefas
                    break;

                case 4:
                    // remover por índice
                    break;

                case 5:
                    // remover por palavra-chave
                    break;

                case 6:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while(opcao != 0);

            }
        } while (opcao != 6);

    }
}
