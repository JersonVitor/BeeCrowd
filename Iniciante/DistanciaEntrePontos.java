package BeeCrowd.Iniciante;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class DistanciaEntrePontos {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
       double x1 = sc.nextDouble();
       double y1 = sc.nextDouble();
       double x2 = sc.nextDouble();
       double y2 = sc.nextDouble();
        DecimalFormat df = new DecimalFormat("#0.0000");
        System.out.println(df.format(dist2P(x1,y1,x2,y2)));
        sc.close();

    }

    public static double dist2P(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
    }
}
