import java.util.Scanner;

public class PorcentagemAcerto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] respostas = lerVetor(scan);
        int[] gabarito = lerVetor(scan);

        int totalQuestoes = respostas.length;
        int acertos = 0;

        for (int i = 0; i < totalQuestoes; i++) {
            if (respostas[i] == gabarito[i]) {
                acertos++;
            }
        }

        double porcentagemAcerto = ((double) acertos / totalQuestoes) * 100;
        System.out.printf("%.2f\n", porcentagemAcerto);

        scan.close();
    }

    private static int[] lerVetor(Scanner scan) {
        int[] vetorTemp = new int[100];
        int tamanho = 0;

        while (true) {
            int valor = scan.nextInt();
            if (valor == -1) {
                break;
            }

            vetorTemp[tamanho++] = valor;
        }

        int[] vetor = new int[tamanho];
        System.arraycopy(vetorTemp, 0, vetor, 0, tamanho);
        return vetor;
    }

}
