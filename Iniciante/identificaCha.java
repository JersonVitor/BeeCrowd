package BeeCrowd.Iniciante;
import java.io.IOException;
 import java.util.Scanner;

 public class identificaCha {
 
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        String cha=sc.nextLine();
        String competidores = sc.nextLine();
        System.out.println(identificador(cha,competidores));
    }
    public static int identificador(String cha,String competidores){
        int vencedores = 0;
        for(int i=0;i<competidores.length();i++){
            if((cha.charAt(0))==competidores.charAt(i)){
                vencedores++;
            }
        }
        return vencedores;
    }
 
}