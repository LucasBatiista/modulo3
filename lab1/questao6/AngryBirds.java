import java.util.Scanner;

public class AngryBirds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double velocidadeinicial = scan.nextDouble();
        double angulo = scan.nextDouble();
        double distanciahorizontal = scan.nextDouble();
        double gravidade = 9.8;

        double alcancemaximo = (Math.pow(Math.abs(velocidadeinicial), 2) * Math.sin(2 * Math.toRadians(angulo)))
                / gravidade;

        if (Math.abs(alcancemaximo - distanciahorizontal) < 0.1) {
            System.out.println("1");
            ;
        } else {
            System.out.println("0");
        }

        scan.close();
    }
}
