import java.util.Scanner;

public class SomaDigitos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        int soma = 0;

        while (numero != 0) {
            soma += numero % 10;
            numero /= 10;
        }
        System.out.printf("%d", soma);
        scan.close();
    }
}
