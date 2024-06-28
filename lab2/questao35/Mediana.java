package lab2.questao35;

import java.util.ArrayList;
import java.util.Scanner;

public class Mediana {
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

            // Calcular e imprimir a mediana
            double mediana = calcularMediana(numeros);
            System.out.printf("%.1f%n", mediana);
        }

        scanner.close();
    }

    public static double calcularMediana(ArrayList<Integer> numeros) {
        int tamanho = numeros.size();

        if (tamanho % 2 == 1) {
            // Se o número de elementos for ímpar, a mediana é o elemento central
            return numeros.get(tamanho / 2);
        } else {
            // Se o número de elementos for par, a mediana é a média dos dois elementos centrais
            int indice1 = tamanho / 2 - 1;
            int indice2 = tamanho / 2;
            return (numeros.get(indice1) + numeros.get(indice2)) / 2.0;
        }
    }
}
