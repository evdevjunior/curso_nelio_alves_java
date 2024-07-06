package exercicios;

import java.util.Scanner;

/* Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto 
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D). */

public class DiferencaProduto {
    
    public static void main(String[] args) {
        
        double A;
        double B;
        double C;
        double D;

        Scanner sc = new Scanner(System.in);
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        D = sc.nextDouble();

        double produto = (A * B - C * D);   // Calcula a diferença dos produtos (AB) pelo (CD)

        System.err.println("A diferença do produto (AB) pelo produto (CD) é : " + produto);
        sc.close();

    }
}
