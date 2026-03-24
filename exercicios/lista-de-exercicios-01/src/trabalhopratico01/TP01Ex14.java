package trabalhopratico01;
import java.util.Scanner;

public class TP01Ex14 {
/*
14. Calcular e exibir o volume livre de um ambiente que contém uma esfera de raio
“r” inscrita em um cubo perfeito de aresta “a”. Os valores de “r “ e “a” serão
digitados.
Jefferson.
*/
    
    public static void main(String[] args)
    {
        double r;
        double a;
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Insira o valor do raio da esfera ");
        r = ler.nextDouble();
        System.out.print("Insira o valor da aresta do cubo perfeito ");
        a = ler.nextDouble();
        
        double vlivre = Math.pow(a, 3) - ((4.0/3.0)*Math.PI*Math.pow(r,3));
        System.out.println("O volume livre do ambiente é " + vlivre);
    }
}