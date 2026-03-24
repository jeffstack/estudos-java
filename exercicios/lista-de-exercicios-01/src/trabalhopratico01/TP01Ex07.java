package trabalhopratico01;
import java.util.Scanner;

public class TP01Ex07 {
/*
7. Calcular e exibir a média geométrica de dois valores quaisquer que serão
digitados.
Jefferson.    
*/    

    public static void main(String[] args)
    {
        double v1;
        double v2;
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Insira o 1º valor ");
        v1 = ler.nextDouble();
        System.out.print("Insira o 2º valor ");
        v2 = ler.nextDouble();
        
        double media = Math.sqrt(v1*v2);
        System.out.println("A média geométrica dos valores digitados é " + media);
    }
}