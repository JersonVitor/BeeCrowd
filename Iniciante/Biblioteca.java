package BeeCrowd.Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Biblioteca {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int tam=Integer.parseInt(sc.nextLine());
        Lista lista = new Lista(tam);
        String codigo;
        while(sc.hasNext()){
            for (int i = 0; i < tam; i++) {
                codigo=sc.nextLine();
                lista.inserir(codigo);
            }
            lista.ordena();
            lista.mostrar();
        }
        sc.close();
    }

}
/**
 * Lista
 */
 class Lista {
    String[] cod;
    int n;
    Lista(int tamanho){
        cod=new String[tamanho];
        n=0;
    }
    void inserir(String x){
        if(n!=cod.length){
            cod[n]=x;
            n++;
        }
    }
    void mostrar(){
        for (int i = 0; i <n; i++) {
            System.out.println(cod[i]);
        }
    }
    void ordena(){
        String chave;
        for (int i = 1; i < n; i++) {
            chave=cod[i];
            int j=i-1;
            while (j>=0&&cod[j].compareTo(chave)>0) {
                cod[j+1]=cod[j];
                j--;
            }
            cod[j+1]=chave;
        }
    }
}
