package BeeCrowd.Iniciante;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Salario {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int numero = sc.nextInt();
        int horas = sc.nextInt();
        double salarioHora = sc.nextDouble();
        double salario = horas * salarioHora;
        DecimalFormat df = new DecimalFormat("#0.00");
        String respFormatado = df.format(salario);
        System.out.println("NUMBER = "+numero);
        System.out.println("SALARY = U$ "+respFormatado);
        sc.close();

    }

}
