//Jefferson Nascimento dos Santos.

import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;
import java.util.InputMismatchException;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data() {
        Scanner sc = new Scanner(System.in);
        int d = 0, m = 0, a = 0;
        boolean entradaValida;

        do {
            entradaValida = true;
            try {
                System.out.print("Digite o dia: ");
                d = sc.nextInt();
                System.out.print("Digite o mês: ");
                m = sc.nextInt();
                System.out.print("Digite o ano: ");
                a = sc.nextInt();

                if (!validar(d, m, a)) {
                    System.out.println("Data inválida! Digite novamente.");
                    entradaValida = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                sc.next(); // Limpa o buffer do scanner
                entradaValida = false;
            }
        } while (!entradaValida);

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
            System.out.println("Data inválida. Usando data padrão (1/1/2000).");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    public void entraDia(int d) {
        if (validar(d, this.mes, this.ano)) {
            this.dia = d;
        } else {
            System.out.println("Dia inválido. Mantendo o dia anterior.");
        }
    }

    public void entraMes(int m) {
        if (validar(this.dia, m, this.ano)) {
            this.mes = m;
        } else {
            System.out.println("Mês inválido. Mantendo o mês anterior.");
        }
    }

    public void entraAno(int a) {
        if (validar(this.dia, this.mes, a)) {
            this.ano = a;
        } else {
            System.out.println("Ano inválido. Mantendo o ano anterior.");
        }
    }

    public void entraDia() {
        Scanner sc = new Scanner(System.in);
        int d = 0;
        boolean entradaValida;
        do {
            entradaValida = true;
            try {
                System.out.print("Digite o dia: ");
                d = sc.nextInt();
                if (!validar(d, this.mes, this.ano)) {
                    System.out.println("Dia inválido. Tente novamente.");
                    entradaValida = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                sc.next();
                entradaValida = false;
            }
        } while (!entradaValida);
        this.dia = d;
    }

    public void entraMes() {
        Scanner sc = new Scanner(System.in);
        int m = 0;
        boolean entradaValida;
        do {
            entradaValida = true;
            try {
                System.out.print("Digite o mês: ");
                m = sc.nextInt();
                if (!validar(this.dia, m, this.ano)) {
                    System.out.println("Mês inválido. Tente novamente.");
                    entradaValida = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                sc.next();
                entradaValida = false;
            }
        } while (!entradaValida);
        this.mes = m;
    }

    public void entraAno() {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        boolean entradaValida;
        do {
            entradaValida = true;
            try {
                System.out.print("Digite o ano: ");
                a = sc.nextInt();
                if (!validar(this.dia, this.mes, a)) {
                    System.out.println("Ano inválido. Tente novamente.");
                    entradaValida = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                sc.next();
                entradaValida = false;
            }
        } while (!entradaValida);
        this.ano = a;
    }

    public int retDia() {
        return this.dia;
    }

    public int retMes() {
        return this.mes;
    }

    public int retAno() {
        return this.ano;
    }

    public String mostra1() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }

    public String mostra2() {
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", 
                          "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        return String.format("%02d/%s/%04d", dia, meses[mes - 1], ano);
    }

    public boolean bissexto() {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    public int diasTranscorridos() {
        int[] diasMes = {0, 31, bissexto() ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int total = 0;
        for (int i = 1; i < mes; i++) {
            total += diasMes[i];
        }
        total += dia;
        return total;
    }

    public void apresentaDataAtual() {
        Date hoje = new Date();
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println("Data atual: " + df.format(hoje));
    }

    private boolean validar(int d, int m, int a) {
        if (a < 1 || m < 1 || m > 12 || d < 1) return false;
        int[] diasMes = {0, 31, ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)) ? 29 : 28, 
                         31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return d <= diasMes[m];
    }
}