import java.util.Scanner;

public class PinturaMuro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double preco = scan.nextDouble();
        double custo = (preco * 12 * 3) + 100;
        System.out.printf("%.1f", custo);
        scan.close();
    }
    
}
