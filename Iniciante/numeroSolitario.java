package BeeCrowd.Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class numeroSolitario {
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int tam=Integer.parseInt(sc.nextLine());
        String entrada;
        int []vetor;
        int j=0;
        while(tam!=0){
            vetor= new int [tam];
            entrada=sc.nextLine();
            for (int i = 0; i < entrada.length(); i+=2,j++) {
                vetor[j]=entrada.charAt(i)-'0';
            }
            System.out.println(numeroS(vetor));
            tam=Integer.parseInt(sc.nextLine());
            j=0;
        }
        sc.close();
    }
    public static int numeroS(int vetor[]) {
        int resp=0;
        int j;
        boolean ehIgual = false;
        for (int i = 0; i < vetor.length-1; i++) {
            j=i+1;
            while(j<vetor.length&&!ehIgual){
                if(vetor[i]!=-1) {
                	if(i+1==vetor.length-1) {
                		ehIgual=true;
                	} else if(vetor[i]==vetor[j]){
                        ehIgual=true;
                        vetor[i]=vetor[j]=-1;
                    }
                }else {
                	i++;
                }
                j++;
            }
            if(!ehIgual){
                resp=vetor[i];
            }
            ehIgual=false;
        }
        return resp;
        
    }
}

