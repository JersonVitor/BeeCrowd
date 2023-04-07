package BeeCrowd.Iniciante;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;


public class Media2 {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        double x = sc.nextDouble()*2;
        double y = sc.nextDouble()*3;
        double z = sc.nextDouble()*5;
        double resp = (x+y+z)/10;
        DecimalFormat df = new DecimalFormat("#0.0");
        String respFormatado = df.format(resp);
        System.out.println("MEDIA = "+respFormatado);
        sc.close();

    }

}