package trabalhopratico01;
import java.util.Scanner;

public class TP01Ex01 {
/*
1. Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua
área.
Jefferson.
*/
    public static void main(String[] args) {
        int base;
        int altura;
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Insira a base do retângulo ");
        base = ler.nextInt();
        System.out.print("Insira a altura do retângulo ");
        altura = ler.nextInt();
        
        int area = base*altura;
        System.out.println("A área do retângulo é " + area);
    }
}