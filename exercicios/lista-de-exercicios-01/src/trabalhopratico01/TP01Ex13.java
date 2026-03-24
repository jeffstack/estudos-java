package trabalhopratico01;
import java.util.Scanner;

public class TP01Ex13 {
/*
13. Calcular e exibir a velocidade final (em km/h) de um automóvel, a partir dos
valores da velocidade inicial (em m/s), da aceleração (m/s2) e do tempo de percurso
(em s) que serão digitados.   
Jefferson.    
*/
    
    public static void main(String[] args)
    {
        double vinicial;
        double aceleracao;
        double tempo;
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Insira a velocidade inicial (em m/s) ");
        vinicial = ler.nextDouble();
        System.out.print("Insira a aceleração (em m/s2) ");
        aceleracao = ler.nextDouble();
        System.out.print("Insira o tempo do percurso (em s) ");
        tempo = ler.nextDouble();
        
        double vfinal = (vinicial+(aceleracao*tempo)) * 3.6;
        System.out.println("A velocidade final em km/h é " + vfinal);
    }
}