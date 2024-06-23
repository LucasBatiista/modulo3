import java.util.Scanner;

public class ParImpar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			int numero = scan.nextInt();
			if (numero == -1) {
				break;
			} else if (numero % 2 == 0) {
				System.out.println("PAR");
			} else {
				System.out.println("IMPAR");
			}
		}
	}
}
