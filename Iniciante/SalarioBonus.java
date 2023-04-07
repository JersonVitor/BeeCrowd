package BeeCrowd.Iniciante;
import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class SalarioBonus {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
       String nome = sc.nextLine();
       double salarioF = sc.nextDouble();
       double comissao = sc.nextDouble() * 0.15;
       double salarioTotal = salarioF+comissao;
       DecimalFormat df = new DecimalFormat("#0.00");
       String total = df.format(salarioTotal);
        System.out.println("TOTAL = "+total);
        sc.close();

    }

}