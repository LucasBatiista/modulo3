import java.util.Scanner;

public class TimeFutebol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Vetores para armazenar os gols marcados pelo time e pelo adversário
        int[] golsTime = new int[100]; // Supomos um tamanho máximo para os vetores
        int[] golsAdversario = new int[100];
        int index = 0;

        // Ler gols marcados pelo time
        while (true) {
            int gols = scanner.nextInt();
            if (gols == -1) {
                break;
            }
            golsTime[index++] = gols;
        }

        index = 0;

        // Ler gols marcados pelo adversário
        while (true) {
            int gols = scanner.nextInt();
            if (gols == -1) {
                break;
            }
            golsAdversario[index++] = gols;
        }

        scanner.close();

        // Calcular o número de vitórias, empates e derrotas
        int vitorias = 0;
        int empates = 0;
        int derrotas = 0;

        for (int i = 0; i < index; i++) {
            if (golsTime[i] > golsAdversario[i]) {
                vitorias++;
            } else if (golsTime[i] < golsAdversario[i]) {
                derrotas++;
            } else {
                empates++;
            }
        }

        // Imprimir os resultados
        System.out.println(vitorias + " " + empates + " " + derrotas);
    }
}
