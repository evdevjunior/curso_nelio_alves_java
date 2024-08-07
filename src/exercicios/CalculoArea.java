package exercicios;

import java.util.Locale;
import java.util.Scanner;

/* Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro 
casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159 */

public class CalculoArea {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double A;
        double raio;
        raio = sc.nextDouble();
        A = Math.PI*raio*raio;  // Calcula a área do circulo utilizando o método para calculos matematicos do Java Lang, MATH e PI
        
        System.out.printf("A = %.4f", A);   // Print formatado em quatro casas decimeis formatando o Float
        sc.close();
        
    }

}