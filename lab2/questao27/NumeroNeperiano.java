import java.util.Scanner;

public class NumeroNeperiano {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double aproximacoes = scan.nextDouble();
        double numero_neperiano = 0;

        for (int i = 0; i < aproximacoes; i++) {
            numero_neperiano += (1/fatorial(i));
        }
        System.out.printf("%.6f", numero_neperiano);
        scan.close();
    }

    public static double fatorial(double numero) {
        double fatorial = 1;
        for (int i = 1; i < numero + 1; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}
