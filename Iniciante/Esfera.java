package BeeCrowd.Iniciante;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;
import static java.lang.Math.pow;


public class Esfera {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int raio = sc.nextInt();
        double pi = 3.14159;
        double resp = (4/3.0)*pi*pow(raio,3);
        DecimalFormat df = new DecimalFormat("#0.000");
        String respFormatado = df.format(resp);
        System.out.println("VOLUME = "+respFormatado);
        sc.close();

    }

}