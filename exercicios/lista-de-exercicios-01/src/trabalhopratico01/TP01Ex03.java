package trabalhopratico01;
import java.util.Scanner;

public class TP01Ex03 {
/*
3. Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será
digitado.
Jefferson.
*/
    
    public static void main(String[] args)
    {
        int diagonal;
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Insira o valor da diagonal do quadrado ");
        diagonal = ler.nextInt();
        
        double area = (diagonal*diagonal)/2;
        System.out.println("A área do quadrado é " + area);
    }
}