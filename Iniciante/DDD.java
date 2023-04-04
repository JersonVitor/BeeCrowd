package BeeCrowd.Iniciante;
import java.io.IOException;
import java.util.Scanner;


public class DDD {
 
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
     int in = sc.nextInt();
     System.out.println(identificaDDD(in));
    }
    public static String identificaDDD(int in) {
        int i=0;
        boolean achou=false;
        String resp;
        String [] ddd={"Brasilia","Salvador","Sao Paulo","Rio de Janeiro","Juiz de Fora","Campinas","Vitoria","Belo Horizonte"};
        int [] cod={61,71,11,21,32,19,27,31};
        while(i<cod.length&&!achou){
            if(cod[i]==in){
                achou=true;
            }else{
                i++;
            }
        }
        if(achou){
            resp=ddd[i];
        } else{
            resp="DDD nao cadastrado";
        }
        return resp;
    }
}