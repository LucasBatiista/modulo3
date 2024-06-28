import java.util.Scanner;

public class AprovacaoDisciplina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Vetores para armazenar as notas e frequências
        double[] notas = new double[100]; // Supomos um tamanho máximo para os vetores
        int[] frequencias = new int[100];
        int index = 0;

        // Ler notas dos alunos
        while (true) {
            double nota = scanner.nextDouble();
            if (nota == -1) {
                break;
            }
            notas[index++] = nota;
        }

        int numAlunos = index;
        index = 0;

        // Ler frequências dos alunos
        while (true) {
            int frequencia = scanner.nextInt();
            if (frequencia == -1) {
                break;
            }
            frequencias[index++] = frequencia;
        }

        // Ler a carga horária da disciplina
        int cargaHoraria = scanner.nextInt();

        scanner.close();

        // Variáveis para contar o número de alunos aprovados, reprovados por nota e reprovados por frequência
        int aprovados = 0;
        int reprovadosPorNota = 0;
        int reprovadosPorFrequencia = 0;

        // Calcular a aprovação, reprovação por nota e reprovação por frequência
        for (int i = 0; i < numAlunos; i++) {
            double nota = notas[i];
            int frequencia = frequencias[i];
            double percentualFrequencia = (double) frequencia / cargaHoraria;

            if (percentualFrequencia < 0.75) {
                reprovadosPorFrequencia++;
            } else if (nota >= 5.0) {
                aprovados++;
            } else {
                reprovadosPorNota++;
            }
        }

        // Imprimir os resultados
        System.out.println(aprovados + " " + reprovadosPorNota + " " + reprovadosPorFrequencia);
    }
}
