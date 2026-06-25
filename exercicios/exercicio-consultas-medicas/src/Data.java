//Reescreva as propriedades e métodos da classe Data, deixando-os de acordo com o padrão UML (Getter e Setter).
//Jefferson Nascimento dos Santos.

import java.util.Scanner;
import java.util.InputMismatchException;

public class Data {

    private int dia;
    private int mes;
    private int ano;

    public Data() {
        Scanner sc = new Scanner(System.in);
        int d = 0, m = 0, a = 0;
        boolean valido;

        do {
            valido = true;
            try {
                System.out.print("Digite o dia: ");
                d = sc.nextInt();
                System.out.print("Digite o mês: ");
                m = sc.nextInt();
                System.out.print("Digite o ano: ");
                a = sc.nextInt();

                if (!validar(d, m, a)) {
                    System.out.println("Data inválida! Tente novamente.");
                    valido = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Digite apenas números.");
                sc.next();
                valido = false;
            }
        } while (!valido);

        this.dia = d;
        this.mes = m;
        this.ano = a;
    }

    public Data(int d, int m, int a) {
        if (validar(d, m, a)) {
            this.dia = d;
            this.mes = m;
            this.ano = a;
        } else {
            System.out.println("Data inválida. Usando 1/1/2000.");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    public void setDia(int d) {
        if (validar(d, this.mes, this.ano)) {
            this.dia = d;
        } else {
            System.out.println("Dia inválido.");
        }
    }

    public void setMes(int m) {
        if (validar(this.dia, m, this.ano)) {
            this.mes = m;
        } else {
            System.out.println("Mês inválido.");
        }
    }

    public void setAno(int a) {
        if (validar(this.dia, this.mes, a)) {
            this.ano = a;
        } else {
            System.out.println("Ano inválido.");
        }
    }

    public void setDia() {
        Scanner sc = new Scanner(System.in);
        int d = 0;
        boolean valido;

        do {
            valido = true;
            try {
                System.out.print("Digite o dia: ");
                d = sc.nextInt();
                if (!validar(d, this.mes, this.ano)) {
                    System.out.println("Dia inválido.");
                    valido = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Digite apenas números.");
                sc.next();
                valido = false;
            }
        } while (!valido);

        this.dia = d;
    }

    public void setMes() {
        Scanner sc = new Scanner(System.in);
        int m = 0;
        boolean valido;

        do {
            valido = true;
            try {
                System.out.print("Digite o mês: ");
                m = sc.nextInt();
                if (!validar(this.dia, m, this.ano)) {
                    System.out.println("Mês inválido.");
                    valido = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Digite apenas números.");
                sc.next();
                valido = false;
            }
        } while (!valido);

        this.mes = m;
    }

    public void setAno() {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        boolean valido;

        do {
            valido = true;
            try {
                System.out.print("Digite o ano: ");
                a = sc.nextInt();
                if (!validar(this.dia, this.mes, a)) {
                    System.out.println("Ano inválido.");
                    valido = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Digite apenas números.");
                sc.next();
                valido = false;
            }
        } while (!valido);

        this.ano = a;
    }

    public int getDia() {
        return this.dia;
    }

    public int getMes() {
        return this.mes;
    }

    public int getAno() {
        return this.ano;
    }

    public String mostra() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }

    private boolean bissexto() {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    private boolean validar(int d, int m, int a) {
        if (a < 1 || m < 1 || m > 12 || d < 1) return false;
        int[] diasMes = {0, 31, bissexto(a) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return d <= diasMes[m];
    }

    private boolean bissexto(int a) {
        return (a % 4 == 0 && a % 100 != 0) || (a % 400 == 0);
    }
}