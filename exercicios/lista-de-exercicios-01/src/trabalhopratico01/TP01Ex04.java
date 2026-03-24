package trabalhopratico01;
import java.util.Scanner;

public class TP01Ex04 {
/*
4. A partir dos valores da base e altura de um triângulo, calcular e exibir sua área.
Jefferson.
*/
    
    public static void main(String[] args)
    {
        int base;
        int altura;
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Insira o valor da base do triângulo ");
        base = ler.nextInt();
        System.out.print("Insira o valor da altura do triângulo ");
        altura = ler.nextInt();
        
        double area = (base*altura)/2;
        System.out.println("A área do triângulo é " + area);
    }
}