package BeeCrowd.Iniciante;
import java.io.IOException;
import java.util.Scanner;


public class NotaDeProva {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
      int nota = sc.nextInt();
        System.out.println(converteNota(nota));
        sc.close();

    }

    private static char converteNota(int nota) {
        char letra;
        if(nota==0){
            letra='E';
        }else if(nota<36){
            letra='D';
        } else if (nota<61) {
            letra='C';
        } else if (nota<86) {
            letra='B';
        }else {
            letra='A';
        }
        return letra;
    }

}
