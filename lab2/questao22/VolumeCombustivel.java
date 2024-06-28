import java.util.Scanner;

public class VolumeCombustivel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double H = scan.nextDouble();
        double h = scan.nextDouble();
        double r = scan.nextDouble();

        if (H < 0 || h < 0 || r < 0) {
            System.out.printf("-1.000\n");
        } else {
            if (h <= r) {
                double volume = (Math.PI * Math.pow(h, 2) * ((3 * r) - h)) / 3;
                System.out.printf("%.3f", volume);
            } else if (r < h && h <= (H - r)) {
                double volume = ((2 * Math.PI * Math.pow(r, 3)) / 3) + (Math.PI * Math.pow(r, 2) * (h - r));
                System.out.printf("%.3f", volume);
            } else if ((H - r) < h && h <= H) {
                double volume = ((2 * Math.PI * Math.pow(r, 3)) / 3) + (Math.PI * Math.pow(r, 2) * (H - (2 * r)))
                        + ((Math.PI * Math.pow((h - (H - r)), 2) * ((3 * r) - (h - (H - r)))) / 3);
                System.out.printf("%.3f", volume);
            } else {
                System.out.printf("-1.000\n");
            }
        }
        scan.close();
    }
}
