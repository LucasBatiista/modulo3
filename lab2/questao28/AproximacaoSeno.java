import java.util.Scanner;

public class AproximacaoSeno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double angulo = scan.nextDouble();
        double k = scan.nextDouble();
        double resultado = 0;
        double indice = 3.00;

        for (int i = 0; i < k; i++) {

            if (i == 0) {
                resultado = Math.toRadians(angulo);
            } else if (i % 2 == 0) {
                resultado += (Math.pow(Math.toRadians(angulo), indice) / fatorial(indice));
                indice += 2.00;
            } else {
                resultado -= (Math.pow(Math.toRadians(angulo), indice) / fatorial(indice));
                indice += 2.00;
            }
            System.out.printf("%.10f\n", resultado);
        }
        scan.close();
    }

    private static double fatorial(double numero) {
        double fatorial = 1;
        for (int i = 1; i < numero + 1; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}
