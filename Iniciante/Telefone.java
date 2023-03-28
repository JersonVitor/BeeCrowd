package BeeCrowd.Iniciante;
import java.io.IOException;
import java.util.Scanner;
public class Telefone {
    
    public static void main(String[] args) throws IOException {
 
       Scanner sc = new Scanner(System.in);
       String telefone = sc.nextLine();
       while(!(telefone.equals("FIM"))){
        System.out.println(conversao(telefone));
        telefone=sc.nextLine();
       }
       sc.close();
        
    }
    public static char[] conversao(String telefone){
        char[] convert = new char[telefone.length()];
        for (int i = 0; i < telefone.length(); i++) {
            convert[i]=troca(telefone.charAt(i));
        }
        return convert;
    }
    public static char troca(char caracter){
        caracter=Character.toUpperCase(caracter);
        char valor=' ';
        if (caracter=='-') {
            valor='-';
        } else if (caracter>='A'&&caracter<='C') {
            valor='2';
        } else if(caracter>='D'&&caracter<='F'){
            valor='3';
        } else  if (caracter>='G'&&caracter<='I') {
            valor='4';
        } else if (caracter>='J'&&caracter<='L') {
            valor='5';
        } else if (caracter>='M'&&caracter<='O') {
            valor='6';
        } else if (caracter>='P'&&caracter<='S'){
            valor='7';
        } else if (caracter>='T'&&caracter<='V') {
            valor='8';
        } else if(caracter>='W'&&caracter<='Z'){
            valor='9';
        }
        return valor;
    }
}
