import java.sql.SQLOutput;
import java.util.*;

public class Main{
    Scanner sc = new Scanner(System.in);

    ArrayList<Tarefa> tarefas = new ArrayList<>();

    public void Menu(){
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
                    listarTarefas();
                    break;

                case 3:
                    filtrarTarefas(1);
                    break;

                case 4:
                    filtrarTarefas(2);
                    break;

                case 5:
                    // remover por palavra-chave
                    break;

                case 6:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 6);
    }
    public void adicionarTarefa(){
        System.out.println("Nova Tarefa: ");
        String descricao = sc.nextLine();

        Tarefa novaTarefa = new Tarefa(descricao);
        tarefas.add(novaTarefa);

        System.out.println("Tarefa adicionada com sucesso!");
    }
    public void listarTarefas(){
        if(tarefas.isEmpty()){
            System.out.println("Nenhuma tarefa cadastrada!");
        } else{
            System.out.println(" ");
            System.out.println("==== LISTA DE TAREFAS ====");
            for(int i=0;i<tarefas.size();i++){
                System.out.println((i+1) + " - " + tarefas.get(i).getDescricao());
            }
        }
    }
    public void filtrarTarefas(int filtro){
        if
        System.out.println("Filtra por:");
        System.out.println("1 - Palavra chave");
    }
    public static void main(String[] args){
        Main programa = new Main();
        programa.Menu();


    }
}
