import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double valor = scan.nextDouble();
        if (valor >= 200) {
            double valor_com_desconto = valor - (valor * 0.05);
            System.out.printf("%.2f\n", valor_com_desconto);
        } else {
            System.out.printf("%.2f\n", valor);
        }
        scan.close();
    }
}
