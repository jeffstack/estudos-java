package trabalhopratico01;
import java.util.Scanner;

public class TP01Ex18 {
/*
18. Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um
valor referente ao pagamento da somatória destes valores. Calcular e exibir o troco
que deverá ser devolvido. 
Jefferson.    
*/
    
    public static void main(String[] args)
    {
        double v1;
        double v2;
        double v3;
        double v4;
        double v5;
        double vpagamento;
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Insira o valor do 1º produto ");
        v1 = ler.nextDouble();
        System.out.print("Insira o valor do 2º produto ");
        v2 = ler.nextDouble();
        System.out.print("Insira o valor do 3º produto ");
        v3 = ler.nextDouble();
        System.out.print("Insira o valor do 4º produto ");
        v4 = ler.nextDouble();
        System.out.print("Insira o valor do 5º produto ");
        v5 = ler.nextDouble();
        System.out.print("Agora insira o valor referente ao pagamento ");
        vpagamento = ler.nextDouble();
        
        double total = v1+v2+v3+v4+v5;
        double troco = vpagamento-total;
        System.out.println("Será devolvido R$" + troco + " de troco");
    }
}
