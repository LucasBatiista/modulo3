import java.util.ArrayList;
import java.util.Scanner;

public class OperacoesInteiros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            ArrayList<Integer> numeros = new ArrayList<>();

            // Ler os números do vetor até encontrar -1
            while (true) {
                int num = scanner.nextInt();
                if (num == -1) {
                    break;
                }
                numeros.add(num);
            }

            // Se o vetor estiver vazio, terminar a execução do programa
            if (numeros.isEmpty()) {
                break;
            }

            // Calcular e imprimir as operações requeridas
            imprimirOperacoes(numeros);
        }

        scanner.close();
    }

    public static void imprimirOperacoes(ArrayList<Integer> numeros) {
        int quantidade = numeros.size();
        int pares = 0;
        int impares = 0;
        int soma = 0;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for (int num : numeros) {
            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
            soma += num;
            if (num > maior) {
                maior = num;
            }
            if (num < menor) {
                menor = num;
            }
        }

        double media = (double) soma / quantidade;

        System.out.println(quantidade);
        System.out.println(pares);
        System.out.println(impares);
        System.out.println(soma);
        System.out.printf("%.2f%n", media);
        System.out.println(maior);
        System.out.println(menor);
    }
}
