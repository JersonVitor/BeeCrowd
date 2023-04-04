package BeeCrowd.Iniciante;
import java.io.IOException;
import java.util.Scanner;

public class FatorialSimples {
 
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
     int n=sc.nextInt();
     System.out.println(fatorial(n));
    }
    public static int fatorial(int n){
        int f;
        if(n==0||n==1){
            f=1;
        }else{
            f=n*fatorial(n-1);
        }
        return f;
    }
 
}