import java.util.Scanner;

public class RaizQuadrada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        double raiz = Math.sqrt(numero);
        System.out.printf("%.4f\n", raiz);
        scan.close();
    }
}
