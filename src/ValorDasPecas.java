
import java.util.Locale;
import java.util.Scanner;


/* Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o 
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago. */

public class ValorDasPecas {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        double codigoPeca;
        int quantidadePeca;
        double valorPeca;

        Scanner sc = new Scanner(System.in);

        codigoPeca = sc.nextDouble();
        quantidadePeca = sc.nextInt();
        valorPeca = sc.nextDouble();

        System.out.println("VALOR A SER PAGO R$ " + quantidadePeca * valorPeca);
        
    }

}