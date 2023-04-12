package BeeCrowd.Iniciante;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class GastoCombustivel {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int horas = sc.nextInt();
        int km = sc.nextInt();
        DecimalFormat df = new DecimalFormat("#0.000");
        System.out.println(df.format((km/12.0)*horas));
        sc.close();

    }
}
