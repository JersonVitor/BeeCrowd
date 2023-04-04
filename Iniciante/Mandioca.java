package BeeCrowd.Iniciante;

import java.io.IOException;
import java.util.Scanner;


public class Mandioca {
 
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
      int qtdConvidados=5;
      int []array = new int[qtdConvidados];
      for (int i = 0; i < array.length; i++) {
        array[i]=sc.nextInt();
      }
      System.out.println(qtdMandioca(array));
    }
    public static int qtdMandioca(int []array) {
        int qtdMandioca = 225;
        int []m={300,1500,600,1000,150};
        for (int i = 0; i < array.length; i++) {
            qtdMandioca+=array[i]*m[i];
        }
      return qtdMandioca;
    }
 
}
