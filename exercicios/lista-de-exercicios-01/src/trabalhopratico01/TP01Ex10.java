package trabalhopratico01;
import java.util.Scanner;

public class TP01Ex10 {
/*
10. Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e
exibir sua temperatura equivalente em Fahrenheit.
Jefferson.
*/
    
    public static void main(String[] args)
    {
        double c;
        double f;
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Insira a temperatura em Celsius ");
        c = ler.nextDouble();
        
        f = (c*1.8)+32;
        System.out.println("A temperatura inserida em Celsius convertida para Fahrenheit é " + f);
    }
}