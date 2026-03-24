package trabalhopratico01;
import java.util.Scanner;

public class TP01Ex09 {
/*
9. Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos
valores da resistência e corrente elétrica que serão digitados. Utilize a lei de Ohm.
Jefferson.
*/
    
    public static void main(String[] args)
    {
        double tensao;
        double resistencia;
        double corrente;
        Scanner ler = new Scanner(System.in);
        
       System.out.print("Insira o valor da resistência do circuito eletrônico ");
       resistencia = ler.nextDouble();
       System.out.print("Agora insira o valor da corrente elétrica ");
       corrente = ler.nextDouble();
       
       tensao = resistencia * corrente;
       System.out.println("A tensão do circuito eletrônico é " + tensao);
    }
}