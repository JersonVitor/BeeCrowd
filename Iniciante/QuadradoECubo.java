package BeeCrowd.Iniciante;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.Math.pow;

public class QuadradoECubo {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
       int x = sc.nextInt();
        for (int i = 1; i <=x ; i++) {
            System.out.println(i+" "+((int)pow(i,2))+" "+((int)pow(i,3)));
        }
    }

}
