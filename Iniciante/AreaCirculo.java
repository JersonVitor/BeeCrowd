package BeeCrowd.Iniciante;
import java.io.IOException;
import java.text.DecimalFormat;

import java.util.Scanner;
 

public class AreaCirculo {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {

       double raio = scanner.nextDouble();
       double area =  ((raio*raio)*3.14159);
       DecimalFormat df = new DecimalFormat("#0.0000");
       String formattedNum = df.format(area);
       System.out.println("A="+formattedNum);
       scanner.close();
    }
 
}