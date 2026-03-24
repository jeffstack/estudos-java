package trabalhopratico01;
import java.util.Scanner;

public class TP01Ex02 {
/*
2. Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será
digitado.
Jefferson.
*/
    
    public static void main(String[] args)
    {
        int aresta;
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Insira o valor da aresta do quadrado ");
        aresta = ler.nextInt();
        
        int area = aresta*aresta;
        System.out.println("A área do quadrado é " + area);
    }
}