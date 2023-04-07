package BeeCrowd.Iniciante;
import java.io.IOException;
import java.util.Scanner;


public class PPAtaqueAereo {
 
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(sc.nextLine());
        String j1;
        String j2;
        for (int i = 0; i < n; i++) {
            j1 = sc.nextLine();
            j2 = sc.nextLine();
            System.out.println(PPA(j1, j2));
    }
        sc.close();

    }

    /**
     * Método que verifica o ganhador do Pedra,Papel,Ataque
     * @param j1 jogador 1
     * @param j2 jogador 2
     * @return o resultado da partida
     */
    public static String PPA( String j1, String j2) {
        String resp="A";
        if(j1.equals(j2)){
            if(j1.equals("papel")){
                resp="Ambos venceram";
            }else if(j1.equals("pedra")){
                resp="Sem ganhador";
            } else{
                resp="Aniquilacao mutua";
            }
        } else{
            if(j1.equals("ataque")||j2.equals("ataque")){
                if(j1.equals("ataque")){
                    resp="Jogador 1 venceu";
                } else{
                    resp="Jogador 2 venceu";
                }
            }
            if(j1.equals("pedra")||j2.equals("pedra")){
                if(j1.equals("pedra")){
                    resp="Jogador 1 venceu";
                } else{
                    resp="Jogador 2 venceu";
                }
            }
        }
        return resp;
    }
}