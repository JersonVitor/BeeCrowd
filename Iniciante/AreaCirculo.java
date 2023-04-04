package BeeCrowd.Iniciante;
import java.io.IOException;
import java.math.BigDecimal;

import java.util.Scanner;
 

public class AreaCirculo {
 
    public static void main(String[] args) throws IOException {
 
       Scanner scanner = new Scanner(System.in);
       double raio = scanner.nextDouble();
       double area =  ((raio*raio)*3.14159);
       BigDecimal bd = new BigDecimal(area).setScale(4);
       double roundedNum = bd.doubleValue();
       System.out.println("A="+roundedNum);
       scanner.close();
    }
 
}