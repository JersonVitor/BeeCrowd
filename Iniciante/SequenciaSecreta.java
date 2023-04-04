package BeeCrowd.Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class SequenciaSecreta {
 
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
     int tam = sc.nextInt();
     int []array = new int[tam];
     for(int i=0;i<tam;i++){
        array[i]=sc.nextInt();
     }
     System.out.println(resolveSequencia(array));
    }
    public static int resolveSequencia(int[]array){
        int count = 0;
        for (int i = 0; i < array.length-1; i++) {
            if(array[i]!=array[i+1]){
                count++;
            }
        }
        // porque como o ultimo não foi testado 
        //e ele sempre será um número diferente do próximo que não tem, ele deve ser contabilizado
        count++;
        return count;
    }
 
}
