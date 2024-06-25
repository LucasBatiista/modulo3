package lab2.questao6;

import java.util.Scanner;

public class AsciiArt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int asteriscos = scan.nextInt();

        for (int i=0; i<asteriscos; i++) {
            System.out.print("*");
            System.out.print("*");
        }
        scan.close();
    }    
}
