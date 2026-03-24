package trabalhopratico01;
import java.util.Scanner;

public class TP01Ex05 {
/*
5. Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que
será digitado.
Jefferson.    
*/
    
    public static void main(String[] args)
    {
        double diametro;
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Insira o valor do diâmetro da esfera ");
        diametro = ler.nextDouble();
        
        double raio = diametro/2;
        double volume = (4.0/3.0)*Math.PI*Math.pow(raio, 3);
        System.out.println("O volume da esfera é " + volume);
    }
}