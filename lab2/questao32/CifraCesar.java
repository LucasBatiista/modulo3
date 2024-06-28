import java.util.Scanner;

public class CifraCesar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int deslocamento = scanner.nextInt();
        String texto = scanner.nextLine();
        String textoCifrado = cifraCesar(texto, deslocamento);
        System.out.println(textoCifrado);

        scanner.close();
    }

    public static String cifraCesar(String texto, int deslocamento) {
        StringBuilder resultado = new StringBuilder();
        deslocamento = deslocamento % 26;

        for (int i = 1; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (c >= 'a' && c <= 'z') {
                char novoChar = (char) (c + deslocamento);
                if (novoChar > 'z') {
                    novoChar = (char) (novoChar - 26);
                }
                resultado.append((char) (novoChar - 'a' + 'A'));
            } else if (c >= 'A' && c <= 'Z') {
                char novoChar = (char) (c + deslocamento);
                if (novoChar > 'Z') {
                    novoChar = (char) (novoChar - 26);
                }
                resultado.append(novoChar);
            } else {
                resultado.append(c);
            }
        }
        return resultado.toString();
    }
}
