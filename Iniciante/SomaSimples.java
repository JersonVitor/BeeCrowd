package BeeCrowd.Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class SomaSimples {
 
    public static void main(String[] args) throws IOException {
 
       Scanner sc = new Scanner(System.in);
       int A = sc.nextInt();
       int B = sc.nextInt();
       int SOMA = A+B;
       System.out.println("SOMA = "+SOMA);
       sc.close();
        
    }

}
 
