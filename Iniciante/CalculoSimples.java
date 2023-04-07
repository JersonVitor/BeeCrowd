package BeeCrowd.Iniciante;
import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class CalculoSimples {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
       String []entrada;
       double resp=0;
        for (int i = 0; i < 2; i++) {
            entrada = sc.nextLine().split(" ");
            resp += Integer.parseInt(entrada[1])*Double.parseDouble(entrada[2]);
        }
        DecimalFormat df = new DecimalFormat("#0.00");
        String respFormatada = df.format(resp);
        System.out.println("VALOR A PAGAR: R$ "+respFormatada);
        sc.close();
    }

}