package BeeCrowd.Iniciante;
import java.io.IOException;
import java.util.*;

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