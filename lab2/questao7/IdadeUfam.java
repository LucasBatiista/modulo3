import java.util.Scanner;

public class IdadeUfam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int idade = scan.nextInt();
        int fundacao = 1909;
        System.out.printf("A UFAM tem %d anos de fundacao", idade - fundacao);
        scan.close();
    }
}
