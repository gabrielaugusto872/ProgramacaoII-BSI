import java.util.*;

public class GabrielAugusto1 {
    public static double CalculaImposto(double salario){
        double aliquota, imposto;

        if(salario < 200){
            aliquota = 0;
        } else if(salario <= 450){
            aliquota = 0.03;
        } else if(salario < 700){
            aliquota = 0.08;
        } else {
            aliquota = 0.12;
        }

        imposto = salario * aliquota;

        return imposto;
    }

    public static int VerificaGratificacao(double salario, int servico){
        int gratificacao;

        if(salario > 500){
            if(servico <= 3){
                gratificacao = 20;
            } else {
                gratificacao = 23;
            }
        } else {
            if(servico <= 3){
                gratificacao = 23;
            } else if(servico < 6){
                gratificacao = 25;
            } else {
                gratificacao = 30;
            }
        }

        return gratificacao;
    }

    public static double CalculaSalario(double salario, double imposto, int gratificacao){
        double salarioLiquido;

        salarioLiquido = salario - imposto + gratificacao;
        return salarioLiquido;
    }

    public static char VerificaCategoria(double salario){
        char categoria;

        if(salario <= 350){
            categoria = 'A';
        } else if(salario < 600){
            categoria = 'B';
        } else {
            categoria = 'C';
        }
        return categoria;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tempo;
        double salarioBase;
        boolean valido = true;

        do {
            System.out.printf("Digite o salário base: ");
            salarioBase = sc.nextDouble();

            System.out.printf("Digite o tempo de serviço: ");
            tempo = sc.nextInt();

            if(salarioBase < 0 || tempo < 0){
                valido = false;
                System.out.printf("Dados inválidos\n");
            } else {
                valido = true;
            }
        }while(!valido);


        System.out.printf("Imposto: R$ %.2f\n", CalculaImposto(salarioBase));
        System.out.printf("Gratificação: R$ %d,00\n", VerificaGratificacao(salarioBase, tempo));
        System.out.printf("Salário Líquido: R$ %.2f\n", CalculaSalario(salarioBase, CalculaImposto(salarioBase), VerificaGratificacao(salarioBase, tempo)));
        System.out.printf("Categoria: %s", VerificaCategoria(CalculaSalario(salarioBase, CalculaImposto(salarioBase), VerificaGratificacao(salarioBase, tempo))));

    }
}