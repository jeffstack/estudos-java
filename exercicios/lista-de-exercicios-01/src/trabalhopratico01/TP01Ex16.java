package trabalhopratico01;
import java.util.Scanner;

public class TP01Ex16 {
/*
16. Entrar via teclado com o valor de um ângulo em graus, calcular e exibir as
seguintes funções trigonométricas: seno, cosseno, tangente e secante deste ângulo.
Lembre-se que uma função trigonométrica trabalha em radianos.
Jefferson.
*/    
    
    public static void main(String[] args)
    {
        double angulo;
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Insira o valor de um ângulo em graus ");
        angulo = ler.nextDouble();
        
        double rad = angulo*Math.PI/180;
        double seno = Math.sin(rad);
        double cosseno = Math.cos(rad);
        
        System.out.println("Seno é " + seno);
        System.out.println("Cosseno é " + cosseno);
        
        if(cosseno != 0)
        {
            double tangente = Math.tan(rad);
            double secante = 1/cosseno;
            System.out.println("Tangente é  " + tangente);
            System.out.println("Secante é " + secante);
        }
        else
        {
            System.out.println("Tangente é indefinida");
            System.out.println("Secante é indefinida");
        }
    }
}