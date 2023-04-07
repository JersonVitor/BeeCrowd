package BeeCrowd.Iniciante;
import java.io.IOException;
import java.util.Scanner;


public class Marmore {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
      int []entrada = conversor(sc.nextLine());
      int i=1;
      while(entrada[0]!=0&&entrada[1]!=0){
          int [] dados = leDados(entrada[0]);
          ordena(dados);
          int [] consultas = leDados(entrada[1]);
          System.out.println("CASE# "+(i)+" :");
          pesquisaBinaria(dados,consultas,entrada[1]);
          i++;
          entrada=conversor(sc.nextLine());
      }
    }

    public static void pesquisaBinaria(int[] dados, int[] consultas, int j) {
        boolean achou;
        int esq,dir,meio;
        for (int i = 0; i < j; i++) {
            achou=false;
            esq=0;
            dir=dados.length - 1;
            meio =0;
            while(!achou&&esq<=dir){
                meio = (esq+dir)/2;
                if(dados[meio]==consultas[i]){
                    achou = true;
                }else if (dados[meio]<consultas[i]){
                    esq = meio + 1;
                } else {
                    dir=meio - 1;
                }
            }
            if(achou){
                System.out.println(consultas[i]+" found at "+ (meio+1));
            } else{
                System.out.println(consultas[i]+" not found");
            }


        }
    }

    public static void ordena(int[] dados) {
        int aux,j;
        for (int i = 1; i < dados.length; i++) {
            aux = dados[i];
            j=i-1;
            while(j>=0&&dados[j]>aux){
                dados[j+1]=dados[j];
                j--;
            }
            dados[j+1]=aux;
        }
    }

    public static int[] leDados(int tam) {
        int[] dados = new int [tam];
        for (int i = 0; i < tam; i++) {
            dados[i]=Integer.parseInt(sc.nextLine());
        }
        return dados;
    }

    public static int[] conversor(String entrada){
        String []valores = entrada.split(" ");
        return new int[]{Integer.parseInt(valores[0]),Integer.parseInt(valores[1])};
    }
}