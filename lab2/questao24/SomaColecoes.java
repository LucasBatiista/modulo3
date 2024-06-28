import java.util.Scanner;

public class SomaColecoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            int soma = 0;
            boolean colecaoVazia = true;
            
            while (true) {
                int valor = scanner.nextInt();
                
                if (valor == -1) {
                    if (colecaoVazia) {
                        // Se a coleção estiver vazia e o usuário inserir -1, o programa termina
                        return;
                    }
                    // Termina a coleção atual e exibe a soma
                    System.out.println(soma);
                    break;
                } else {
                    colecaoVazia = false;
                    soma += valor;
                }
            }
        }
    }
}
