package BeeCrowd.Iniciante;
import java.io.IOException;
import java.util.Scanner;


public class Tacografo {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
      int tam = Integer.parseInt(sc.nextLine());
        System.out.println(tacografo(tam));
        sc.close();

    }
    public static int tacografo(int tam){
        String entrada ;
        String []valores;
        int soma = 0;
        for(int i=0;i<tam;i++){
            entrada = sc.nextLine();
            valores = entrada.split(" ");
            soma+=(Integer.parseInt(valores[0])*Integer.parseInt(valores[1]));
        }
        return soma;
    }
}
