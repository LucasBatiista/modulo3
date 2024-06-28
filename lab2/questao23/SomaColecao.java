import java.util.Scanner;

public class SomaColecao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int soma = 0;
        int valor;

        while (true) {
            valor = scan.nextInt();
            if (valor == -1) {
                break;
            }
            soma += valor;
        }
        System.out.printf("%d", soma);
        scan.close();
    }
}
