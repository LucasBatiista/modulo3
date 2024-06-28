import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int montante = scan.nextInt();

        if (montante % 2 != 0 || montante < 0) {
            System.out.println("Valor Invalido");
        } else {
            int montante_cinquenta = montante - (montante % 50);
            int notas_cinquenta = montante_cinquenta / 50;

            int montante_dez = montante - (montante_cinquenta) - (montante % 10);
            int notas_dez = montante_dez / 10;

            int montante_dois = montante - (montante_cinquenta) - (montante_dez) - (montante % 2);
            int notas_dois = montante_dois / 2;

            System.out.printf("%d notas de R$50, %d notas de R$10 e %d notas de R$2", notas_cinquenta, notas_dez,
                    notas_dois);
        }
        scan.close();
    }
}
