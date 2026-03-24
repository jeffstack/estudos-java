package trabalhopratico01;
import java.util.Scanner;

public class TP01Ex12 {
/*
12. Calcular e exibir o volume de um cone a partir dos valores da altura e do raio da
base que serão digitados.
Jefferson.
*/

    public static void main(String[] args)
    {
        double altura;
        double raio;
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Insira o valor da altura do cone ");
        altura = ler.nextDouble();
        System.out.print("Insira o valor do raio da base do cone ");
        raio = ler.nextDouble();
        
        double volume = (1.0/3.0*Math.PI*Math.pow(raio, 2)*altura);
        System.out.println("O volume do cone é " + volume);
    }
}