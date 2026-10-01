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
            System.out.println("4 - Remover tarefas por índice");
            System.out.println("5 - Remover tarefas por palavra-chave");
            System.out.println("6 - Concluir tarefas por índice");
            System.out.println("7 - Concluir tarefas por palavra-chave");
            System.out.println("8 - Sair");
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
                    filtrarTarefas();
                    break;
                case 4:
                    removerTarefas(1);
                    break;
                case 5:
                    removerTarefas(2);
                    break;
                case 6:
                    marcarTarefas(1);
                    break;
                case 7:
                    marcarTarefas(2);
                    break;
                case 8:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 8);
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
    public void filtrarTarefas(){
        int encontradas = 0;
        String palavra, desc;

        if(tarefas.isEmpty()){
            System.out.println("Não há tarefas cadastradas!");
        } else{
            System.out.printf("Palavra-chave: ");
            palavra = sc.nextLine();
            palavra = palavra.toLowerCase();

            System.out.println(" ");
            System.out.println("===== " + palavra.toUpperCase() + " =====");
            for(int i=0;i<tarefas.size();i++){
                desc = tarefas.get(i).getDescricao();
                if(desc.toLowerCase().contains(palavra)){
                    System.out.println((i+1) + " - " + desc);
                    encontradas++;
                }
            }
            if(encontradas == 0){
                System.out.println("Nenhuma tarefa encontrada!");
            }
        }
    }
    public void removerTarefas(int filtro){
        Iterator<Tarefa> it = tarefas.iterator();
        boolean encontrou = false;

        if(filtro == 1){
            int indice, indiceAtual = 0;

            if(tarefas.isEmpty()){
                System.out.println("Não há tarefas cadastradas!");
            } else{
                System.out.println("Digite o índice da tarefa que deseja remover: ");
                indice = sc.nextInt();
                sc.nextLine();
                indice--;

                while (it.hasNext()){
                    Tarefa tarefaAtual = it.next();
                    if(indiceAtual == indice){
                        encontrou = true;
                        System.out.println("Tarefa removida: " + tarefaAtual.getDescricao());
                        it.remove();
                        break;
                    }
                    indiceAtual++;
                }
                if(!encontrou){
                    System.out.println("Índice não encontrado!");
                }
            }
        } else {
            String palavra, simNao;
            int encontradas = 0, indiceAtual = 0;

            if(tarefas.isEmpty()){
                System.out.println("Não há tarefas cadastradas!");
            } else {
                System.out.println("Digite a palavra-chave: ");
                palavra = sc.nextLine();

                System.out.println(" ");
                System.out.println("===== " + palavra.toUpperCase() + " =====");

                while(it.hasNext()){
                    Tarefa tarefaAtual = it.next();


                    if(tarefaAtual.getDescricao().toLowerCase().contains(palavra.toLowerCase())){
                        System.out.println((indiceAtual+1) + " - " + tarefaAtual.getDescricao());
                        System.out.println("Deseja remover a tarefa acima?(s/n)");
                        simNao = sc.nextLine();

                        if(simNao.equalsIgnoreCase("s")){
                            System.out.println("Tarefa removida!");
                            it.remove();
                        }
                        System.out.printf(" ");
                        encontradas++;
                    }
                    indiceAtual++;
                }

                if(encontradas == 0){
                    System.out.println("Nenhuma tarefa encontrada!");
                }
            }
        }
    }
    public void marcarTarefas(int filtro){
        Iterator<Tarefa> it = tarefas.iterator();
        boolean encontrou = false;

        if(filtro == 1){
            int indice, indiceAtual = 0;

            if(tarefas.isEmpty()){
                System.out.println("Não há tarefas cadastradas!");
            } else{
                System.out.println("Digite o índice da tarefa que deseja concluir: ");
                indice = sc.nextInt();
                sc.nextLine();
                indice--;

                while (it.hasNext()){
                    Tarefa tarefaAtual = it.next();
                    if(indiceAtual == indice){
                        if (!(tarefaAtual.isCompleta())){
                            tarefaAtual.concluir();
                            System.out.println("Tarefa concluída: " + tarefaAtual.getDescricao());
                        } else {
                            System.out.println("Essa tarefa ja foi completa!");
                        }
                        encontrou = true;
                        break;
                    }
                    indiceAtual++;
                }
                if(!encontrou){
                    System.out.println("Índice não encontrado!");
                }
            }
        } else{
            String palavra, simNao;
            int encontradas = 0, indiceAtual = 0;

            if(tarefas.isEmpty()){
                System.out.println("Não há tarefas cadastradas!");
            } else {
                System.out.println("Digite a palavra-chave: ");
                palavra = sc.nextLine();

                System.out.println(" ");
                System.out.println("===== " + palavra.toUpperCase() + " =====");

                while(it.hasNext()){
                    Tarefa tarefaAtual = it.next();

                    if(tarefaAtual.getDescricao().toLowerCase().contains(palavra.toLowerCase())){
                        System.out.println((indiceAtual+1) + " - " + tarefaAtual.getDescricao());
                        if(!(tarefaAtual.isCompleta())){
                            System.out.println("Deseja marcar a tarefa acima como concluída?(s/n)");
                            simNao = sc.nextLine();

                            if(simNao.equalsIgnoreCase("s")){
                                System.out.println("Tarefa concluída!");
                                tarefaAtual.concluir();
                            }
                            System.out.printf(" ");
                        } else {
                            System.out.println("Essa tarefa ja foi completa!");
                        }
                        encontradas++;
                    }
                    indiceAtual++;
                }

                if(encontradas == 0){
                    System.out.println("Nenhuma tarefa encontrada!");
                }
            }

        }
    }
    public static void main(String[] args){
        Main programa = new Main();
        programa.Menu();


    }
}
