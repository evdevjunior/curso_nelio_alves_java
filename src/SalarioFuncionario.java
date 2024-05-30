
import java.util.Locale;
import java.util.Scanner;

/* Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por 
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas 
decimais. */

public class SalarioFuncionario {
    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        int funcionario_id;
        double horasTrabalhada;
        double valorHora;

        Scanner sc = new Scanner(System.in);

        funcionario_id = sc.nextInt();
        horasTrabalhada = sc.nextDouble();
        valorHora = sc.nextDouble();
        double salario = (horasTrabalhada * valorHora); 

        System.out.println("ID_FUNCIONARIO : " + funcionario_id);
        System.out.println("SALARIO : " + salario);
        sc.close();
        

    }
}
