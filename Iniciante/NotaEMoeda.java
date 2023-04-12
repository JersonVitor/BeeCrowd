package BeeCrowd.Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class NotaEMoeda {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        double valor = sc.nextDouble();
        int nota =(int)( valor/100);
        System.out.println("NOTAS:");
        System.out.println(nota+ " nota(s) de R$ 100.00");
        valor = valor - (nota*100);
        nota = (int)( valor/50);
        System.out.println(nota+ " nota(s) de R$ 50.00");
        valor = valor - (nota*50);
        nota = (int)( valor/20);
        System.out.println(nota+" nota(s) de R$ 20.00");
        valor = valor - (nota*20);
        nota = (int)( valor/10);
        System.out.println(nota+" nota(s) de R$ 10.00");
        valor = valor - (nota*10);
        nota = (int)( valor/5);
        System.out.println(nota+" nota(s) de R$ 5.00");
        valor = valor - (nota*5);
        nota = (int)( valor/2);
        System.out.println(nota+" nota(s) de R$ 2.00");
        valor = valor - (nota*2);
        nota = (int)valor;
        System.out.println("MOEDAS:");
        System.out.println(nota+" moeda(s) de R$ 1.00");
        valor-=nota;
        int moeda =(int) (valor/0.50);
        System.out.println(moeda+" moeda(s) de R$ 0.50");
        valor = valor - (moeda*0.50);
        moeda = (int)(valor/0.25);
        System.out.println(moeda+" moeda(s) de R$ 0.25");
        valor = valor - (moeda*0.25);
        moeda =(int) (valor/0.10);
        System.out.println(moeda+" moeda(s) de R$ 0.10");
        valor = valor - (moeda*0.10);
        moeda = (int)(valor/0.05);
        System.out.println(moeda+" moeda(s) de R$ 0.05");
        valor = valor - (moeda*0.05);
        moeda =(int) (valor*100);
        System.out.println(moeda+" moeda(s) de R$ 0.01");
        sc.close();

    }
}
