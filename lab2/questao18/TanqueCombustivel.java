import java.util.Scanner;

public class TanqueCombustivel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double raio = scan.nextDouble();
        double altura_do_ar = scan.nextDouble();
        int opcao = scan.nextInt(); // 1 para volume do ar , 2 para volume combustivel

        if (opcao == 1) {
            double volume_de_ar = (Math.PI * Math.pow(altura_do_ar, 2) * ((3 * raio) - altura_do_ar)) / 3;
            System.out.printf("%.4f\n", volume_de_ar);
        } else if (opcao == 2) {
            double volume_de_combustivel = ((4 * Math.PI * Math.pow(raio, 3)) / 3) - ((Math.PI * Math.pow(altura_do_ar, 2) * ((3 * raio) - altura_do_ar)) / 3);
            System.out.printf("%.4f\n", volume_de_combustivel);
        }
        scan.close();
    }
}
