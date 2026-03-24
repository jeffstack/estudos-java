package trabalhopratico01;
 import java.util.Scanner;

public class TP01Ex08 {
/*
8. Sabendo que uma milha marítima equivale a um mil, oitocentos e cinquenta e
dois metros e que um quilômetro possui mil metros, fazer um programa para
converter milhas marítimas em quilômetros.  
Jefferson.
*/
    
    public static void main(String[] args)
    {
        double quilometro;
        double milha;
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Insira o valor da milha que deseja converter para quilômetro ");
        milha = ler.nextDouble();
        
        quilometro = milha * 1.852;
        System.out.println("A milha inserida em quilômetros é " + quilometro);
    }
}