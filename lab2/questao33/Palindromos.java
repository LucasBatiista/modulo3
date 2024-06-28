import java.util.Scanner;

public class Palindromos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String cleanedInput = input.replaceAll("[^a-zA-Z]", "").toUpperCase();
        boolean isPalindrome = isPalindrome(cleanedInput);
        System.out.println(cleanedInput + " " + (isPalindrome ? 1 : 0));
        scanner.close();
    }

    private static boolean isPalindrome(String s) {
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
