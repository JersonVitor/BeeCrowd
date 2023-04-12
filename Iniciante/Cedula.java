package BeeCrowd.Iniciante;
import java.io.IOException;
import java.util.Scanner;
public class Cedula {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int valor = sc.nextInt();
        int resp = valor/100;
        System.out.println(valor);
        System.out.println(resp+ " nota(s) de R$ 100,00");
        valor = valor - (resp*100);
        resp = valor/50;
        System.out.println(resp+ " nota(s) de R$ 50,00");
        valor = valor - (resp*50);
        resp = valor/20;
        System.out.println(resp+" nota(s) de R$ 20,00");
        valor = valor - (resp*20);
        resp = valor/10;
        System.out.println(resp+" nota(s) de R$ 10,00");
        valor = valor - (resp*10);
        resp = valor/5;
        System.out.println(resp+" nota(s) de R$ 5,00");
        valor = valor - (resp*5);
        resp = valor/2;
        System.out.println(resp+" nota(s) de R$ 2,00");
        valor = valor - (resp*2);
        resp = valor;
        System.out.println(resp+" nota(s) de R$ 1,00");
        sc.close();

    }

}
