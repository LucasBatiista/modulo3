import java.util.Scanner;

public class ContaEnergia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double consumo = scan.nextDouble();
        char tipo = scan.next().charAt(0);

        if (consumo < 0) {
            System.out.printf("%.2f\n", -1.00);
        } else {

            switch (tipo) {
                case 'R':
                    if (consumo > 500) {
                        double conta = consumo * 0.65;
                        System.out.printf("%.2f\n", conta);
                    } else {
                        double conta = consumo * 0.40;
                        System.out.printf("%.2f\n", conta);
                    }
                    break;

                case 'C':
                    if (consumo > 1000) {
                        double conta = consumo * 0.60;
                        System.out.printf("%.2f\n", conta);
                    } else {
                        double conta = consumo * 0.55;
                        System.out.printf("%.2f\n", conta);
                    }
                    break;

                case 'I':
                    if (consumo > 500) {
                        double conta = consumo * 0.60;
                        System.out.printf("%.2f\n", conta);
                    } else {
                        double conta = consumo * 0.55;
                        System.out.printf("%.2f\n", conta);
                    }
                    break;

                default:
                    System.out.printf("%.2f\n", -1.00);
                    break;
            }
        }

        scan.close();
    }
}
