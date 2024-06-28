import java.util.Scanner;

public class Xadrez {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int linhas = scan.nextInt();
        String str1 = "* ";
        String str2 = " *";

        for (int i = 0; i < linhas; i++) {
            if (i % 2 == 0) {
                String newstr1 = str1.repeat(linhas);
                System.out.println(newstr1);
            } else {
                String newstr2 = str2.repeat(linhas);
                System.out.println(newstr2);
            }
        }
        scan.close();
    }
}
