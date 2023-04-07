package BeeCrowd.Iniciante;
import java.io.IOException;
 import java.util.Scanner;

public class BuscaNaInternet {
  static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
       int x = sc.nextInt();
       int resp= 2*(2*x);
       System.out.println(resp);
        sc.close();
    }
}