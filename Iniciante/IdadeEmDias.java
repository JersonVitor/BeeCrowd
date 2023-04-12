package BeeCrowd.Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class IdadeEmDias {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int dias = sc.nextInt();
        int anos = dias/365;
        dias -= anos*365;
        int meses = dias/30;
        dias -= meses*30;
        System.out.println(anos+" ano(s)");
        System.out.println(meses+" mes(es)");
        System.out.println(dias+" dia(s)");
        sc.close();

    }
}
