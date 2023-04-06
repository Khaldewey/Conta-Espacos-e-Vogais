
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Ola Mundo";
        String[] strSplit = str.split(" ");
        String[] arrVogais = {"a", "e", "i", "o", "u"};
        int espacosEmBranco = strSplit.length - 1, quantVogais = 0;

        for (String item : strSplit) {
           for(String vogal : arrVogais){
               if(item.toLowerCase().contains(vogal)){
                   quantVogais++;
               }
           }
        }
        System.out.println("Espacos em branco: " + espacosEmBranco + " Vogais: " + quantVogais);
    }
}