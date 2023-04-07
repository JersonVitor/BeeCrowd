package BeeCrowd.Iniciante;
import java.io.IOException;
import java.util.Scanner;


public class Pneu {
 
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
      int pressaoD = sc.nextInt();
      int pressaoL = sc.nextInt();
      System.out.println((pressaoD-pressaoL));
        sc.close();

    }
 
}