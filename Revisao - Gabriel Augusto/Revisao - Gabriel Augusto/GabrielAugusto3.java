import java.util.*;

public class GabrielAugusto3 {
    static Scanner sc = new Scanner(System.in);

    public static void lerVendas(double[][] vendas){
        for (int i=0;i<5;i++){
            for(int j=0;j<4;j++){
                System.out.printf("Digite a %s° venda do %s° vendedor: ", j+1, i+1);
                vendas[i][j] = sc.nextDouble();
            }
            System.out.printf("\n");
        }
    }

    public static void totalVendedores(double[][] vendas){
        System.out.printf("Total de vendas do mês de cada vendedor:\n");
        for (int i=0;i<5;i++){
            double soma = 0;
            for (int j=0;j<4;j++){
                soma += vendas[i][j];
            }

            System.out.printf("Vendedor %s: R$ %.2f\n", i+1, soma);
        }
    }

    public static void totalSemanas(double[][] vendas){
        System.out.printf("Total de vendas de cada semana:\n");
        for (int j=0;j<4;j++){
            double soma = 0;
            for (int i=0;i<4;i++){
                soma += vendas[i][j];
            }

            System.out.printf("Semana %s: R$ %.2f\n", j+1, soma);
        }
    }

    public static void totalMes(double[][] vendas){
        double soma = 0;

        for (int i=0;i<5;i++) {
            for (int j = 0; j < 4; j++) {
                soma += vendas[i][j];
            }
        }
        System.out.printf("Total de vendas no mês: R$ %.2f\n", soma);
    }

    public static void main(String[] args){
        double vendas[][] = new double[5][4];

        lerVendas(vendas);

        System.out.printf("\n");

        totalVendedores(vendas);
        totalSemanas(vendas);
        totalMes(vendas);
    }
}
