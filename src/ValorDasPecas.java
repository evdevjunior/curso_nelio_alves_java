
import java.util.Locale;
import java.util.Scanner;


/* Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o 
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago. */

public class ValorDasPecas {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        double codigoPeca1;
        double codigoPeca2;
        int quantidadePeca1;
        int quantidadePeca2;
        double valorPeca1;
        double valorPeca2;
        double valorTotalPeca1;
        double valorTotalPeca2;

        Scanner sc = new Scanner(System.in);

        codigoPeca1 = sc.nextDouble();
        quantidadePeca1 = sc.nextInt();
        valorPeca1 = sc.nextDouble();

        codigoPeca2 = sc.nextDouble();
        quantidadePeca2 = sc.nextInt();
        valorPeca2 = sc.nextDouble();

        valorTotalPeca1 = (quantidadePeca1 * valorPeca1);
        valorTotalPeca2 = (quantidadePeca2 * valorPeca2);

        double valorTotalPecas = (valorTotalPeca1 + valorTotalPeca2);

        System.out.println("VALOR A SER PAGO PELAS PEÇAS R$ " + valorTotalPecas);
        sc.close();
        
    }

}