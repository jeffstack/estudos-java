package trabalhopratico01;
import java.util.Scanner;

public class TP01Ex15 {
/*
15. Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de
dólares. Calcular e exibir o valor correspondente em Reais (R$). 
Jefferson.    
*/    
    
    public static void main(String[] args)
    {
        double cdolar;
        double vdolar;
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Insira o valor da cotação do dólar ");
        cdolar = ler.nextDouble();
        System.out.print("Insira o valor em dólares que deseja converter ");
        vdolar = ler.nextDouble();
        
        double vreais = cdolar*vdolar;
        System.out.println("Dada a cotação do dólar, o valor em reais é " + vreais);
    }
}