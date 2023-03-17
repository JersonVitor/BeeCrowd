package BeeCrowd.Iniciante;
import java.io.IOException;
import java.util.*;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class ExtremamenteBasico {
 
    public static void main(String[] args) throws IOException {
 
       Scanner sc = new Scanner (System.in);
       int A = sc.nextInt();
       int B = sc.nextInt();
       int resp = A+B;
       System.out.println("X = "+resp);
       sc.close();
    }
 
}