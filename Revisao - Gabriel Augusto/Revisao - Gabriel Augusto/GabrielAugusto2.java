import java.util.*;

public class GabrielAugusto2 {
    static Scanner sc = new Scanner(System.in);

    public static void CalculaImposto(){
        double salario, imposto;

        System.out.printf("Digite o salário: ");
        salario = sc.nextDouble();

        if (salario < 500){
            imposto = 0.05;
        } else if(salario <= 850){
            imposto = 0.10;
        } else {
            imposto = 0.15;
        }

        imposto *= salario;

        System.out.printf("Imposto: R$ %.2f\n", imposto);
    }

    public static void CalculaNovoSalario(){
        double salario, aumento, novoSalario;

        System.out.printf("Digite o valor do salário: ");
        salario = sc.nextDouble();

        if (salario > 1500){
            aumento = 25;
        } else if (salario >= 750){
            aumento = 50;
        } else if(salario > 450){
            aumento = 75;
        } else {
            aumento = 100;
        }

        novoSalario = salario + aumento;

        System.out.printf("Novo salário: R$ %.2f\n", novoSalario);
    }

    public static void VerificaClassificacao(){
        double salario;

        System.out.printf("Digite o valor do salário: ");
        salario = sc.nextDouble();

        if(salario > 700){
            System.out.printf("Bem remunerado!\n");
        } else {
            System.out.printf("Mal remunerado!\n");
        }
    }

    public static void Menu(){
        System.out.println("Menu de opções: ");
        System.out.println("1. Imposto");
        System.out.println("2. Novo Salário");
        System.out.println("3. Classificação");
        System.out.println("4. Finalizar o programa");

        int opcao;

        do {
            System.out.printf("Digite a opção desejada: ");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    CalculaImposto();
                    break;
                case 2:
                    CalculaNovoSalario();
                    break;
                case 3:
                    VerificaClassificacao();
                    break;
                case 4:
                    System.out.printf("Finalizando o programa...\n");
                    System.out.printf("Programa encerrado!");
                    break;
                default:
                    System.out.printf("Opção inválida!\n");
            }
        } while (opcao != 4);
    }

    public static void main(String[] args) {
        Menu();
    }
}