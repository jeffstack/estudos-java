package trabalhopratico01;
import java.util.Scanner;

public class TP01Ex11 {
/*
11. A partir do diâmetro de um círculo que será digitado, calcular e exibir sua área.
Jefferson.
*/

    public static void main(String[] args)
    {
        double diametro;
        Scanner ler = new Scanner(System.in);
    
        System.out.print("Digite o diâmetro do círculo ");
        diametro = ler.nextDouble();
        
        double area = Math.PI*Math.pow((diametro/2),2);
        System.out.println("A área do círculo é " + area);
    }
}