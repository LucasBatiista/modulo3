import java.util.Scanner;

public class MediaColecao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double soma = 0;
        double contador = 0;
        double valor;

        while (true) {
            valor = scan.nextDouble();
            if (valor == -1) {
                break;
            }
            soma += valor;
            contador += 1;
        }
        System.out.printf("%.2f", soma / contador);
        scan.close();
    }
}
