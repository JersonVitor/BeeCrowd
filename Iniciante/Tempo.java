package BeeCrowd.Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Tempo {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
       int segundos = sc.nextInt();
       int horas = segundos/3600;
       segundos -= horas*3600;
       int minutos = segundos/60;
       segundos -= minutos*60;
        System.out.println(horas+":"+minutos+":"+segundos);
        sc.close();

    }

}
