package BeeCrowd.Iniciante;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;


public class Media1 {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        double x = sc.nextDouble()*3.5;
        double y = sc.nextDouble()*7.5;
        double resp = (x+y)/11;
        DecimalFormat df = new DecimalFormat("#0.00000");
        String respFormatado = df.format(resp);
        System.out.println("MEDIA = "+respFormatado);
        sc.close();

    }

}