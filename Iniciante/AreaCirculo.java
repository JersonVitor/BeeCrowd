package BeeCrowd.Iniciante;
import java.io.IOException;
import java.math.BigDecimal;

import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
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