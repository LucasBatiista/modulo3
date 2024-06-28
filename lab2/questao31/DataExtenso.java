import java.util.Scanner;

public class DataExtenso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        String dia = data.substring(0, 2);
        String mes = data.substring(2, 4);
        String ano = data.substring(4, 8);

        String[] meses = {
                "janeiro", "fevereiro", "março", "abril", "maio", "junho",
                "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"
        };
        int mesIndex = Integer.parseInt(mes) - 1;

        String dataPorExtenso = dia + " de " + meses[mesIndex] + " de " + ano;
        System.out.println(dataPorExtenso);

        scanner.close();
    }
}
