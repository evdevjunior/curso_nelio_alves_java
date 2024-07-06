package exercicios;

import java.util.Scanner;

/* Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma 
mensagem explicativa, conforme exemplos. */

public class SomaNumeros {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int x;
        int y;
        int soma;
        x = sc.nextInt();
        y = sc.nextInt();
        soma = (x + y); // Simples soma de dois números

        System.out.println(soma);   // Printa a o resultado da soma
        sc.close(); // Fecha o Scanner
    }
    
}
