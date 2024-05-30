import java.util.Scanner;

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

        double produto = (A * B - C * D);

        System.err.println("A diferença do produto (AB) pelo produto (CD) é : " + produto);
        sc.close();

    }
}
