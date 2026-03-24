package trabalhopratico01;
import java.util.Scanner;

public class TP01Ex06 {
/*
6. Calcular e exibir a média aritmética de quatro valores quaisquer que serão
digitados.
Jefferson.    
*/    
    
    public static void main(String[] args)
    {
        double v1;
        double v2;
        double v3;
        double v4;
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Insira o 1º valor ");
        v1 = ler.nextDouble();
        System.out.print("Insira o 2º valor ");
        v2 = ler.nextDouble();
        System.out.print("Insira o 3º valor ");
        v3 = ler.nextDouble();
        System.out.print("Insira o 4º valor ");
        v4 = ler.nextDouble();
        
        double media = (v1+v2+v3+v4)/4;
        System.out.println("A média aritmética dos valores inseridos é " + media);
    }
}