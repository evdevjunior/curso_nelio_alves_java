package exercicios;

import java.util.Locale;
import java.util.Scanner;


/* Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e 
mostre: 
a) a área do triângulo retângulo que tem A por base e C por altura.  base b x altura h / 2
b) a área do círculo de raio C. (pi = 3.14159) raio x raio x PI
c) a área do trapézio que tem A e B por bases e C por altura. base menor b + base maior B * altura h / 2
d) a área do quadrado que tem lado B. lado L x lado L
e) a área do retângulo que tem lados A e B. base b x altura h */
public class CalculoDasFormasGeometricas {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US); // seta a localização para precisão do pontoflutuante 0.0

        double A; // variaveis dos lados, altura e formas geometricas
        double B;
        double C;
        double trianguloRetangulo;
        double circulo;
        double trapezio;
        double quadrado;
        double retangulo;

        Scanner sc = new Scanner(System.in); // usa a classe Scanner para pegar dados e atribuir as variaveis

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        trianguloRetangulo = (C * A) / 2; // formas de cada forma geometrica
        circulo = (C * C * 3.14159);
        trapezio = ((A + B) * C) / 2;
        quadrado = (B * B);
        retangulo = (A * B);

        System.out.printf("TRIANGULO-RETANGULO : %.3f%n", trianguloRetangulo); // imprime as formulas geometricas formatadas com 3 casas decimais
        System.err.printf("CIRCULO : %.3f%n", circulo);
        System.err.printf("TRAPÉZIO : %.3f%n", trapezio);
        System.err.printf("QUADRADO : %.3f%n", quadrado);
        System.out.printf("RETANGULO : %.3f%n", retangulo);
        sc.close();
        
    }
}