package trabalhopratico01;
import java.util.Scanner;

public class TP01Ex17 {
/*
17. Entrar via teclado com dois valores quaisquer “X” e “Y”. Calcular e exibir o
cálculo XY (“X” elevado a “Y”). Pesquisar as funções Exp e Ln.
Jefferson.    
*/
    
    public static void main(String[] args)
        {
            double x;
            double y;
            Scanner ler = new Scanner(System.in);
            
            System.out.print("Insira o valor de X ");
            x = ler.nextDouble();
            System.out.print("Insira o valor de Y ");
            y = ler.nextDouble();
            
            double resultado = Math.exp(y * Math.log(x));
            System.out.println("O resultado é " + resultado);
        }    
}