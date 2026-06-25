//Jefferson Nascimento dos Santos.

import java.util.Scanner;
import java.util.InputMismatchException;

public class Hora {

    private int hora;
    private int minuto;
    private int segundo;

    public Hora() {
        Scanner sc = new Scanner(System.in);
        int h = 0, mi = 0, s = 0;
        boolean valido;

        do {
            valido = true;
            try {
                System.out.print("Digite a hora: ");
                h = sc.nextInt();
                System.out.print("Digite o minuto: ");
                mi = sc.nextInt();
                System.out.print("Digite o segundo: ");
                s = sc.nextInt();

                if (!validar(h, mi, s)) {
                    System.out.println("Hora inválida! Tente novamente.");
                    valido = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Digite apenas números.");
                sc.next();
                valido = false;
            }
        } while (!valido);

        this.hora = h;
        this.minuto = mi;
        this.segundo = s;
    }

    public Hora(int h, int mi, int s) {
        if (validar(h, mi, s)) {
            this.hora = h;
            this.minuto = mi;
            this.segundo = s;
        } else {
            System.out.println("Hora inválida. Usando 0:0:0.");
            this.hora = 0;
            this.minuto = 0;
            this.segundo = 0;
        }
    }

    public void setHora(int h) {
        if (validar(h, this.minuto, this.segundo)) {
            this.hora = h;
        } else {
            System.out.println("Hora inválida.");
        }
    }

    public void setMinuto(int mi) {
        if (validar(this.hora, mi, this.segundo)) {
            this.minuto = mi;
        } else {
            System.out.println("Minuto inválido.");
        }
    }

    public void setSegundo(int s) {
        if (validar(this.hora, this.minuto, s)) {
            this.segundo = s;
        } else {
            System.out.println("Segundo inválido.");
        }
    }

    public void setHora() {
        Scanner sc = new Scanner(System.in);
        int h = 0;
        boolean valido;

        do {
            valido = true;
            try {
                System.out.print("Digite a hora: ");
                h = sc.nextInt();
                if (!validar(h, this.minuto, this.segundo)) {
                    System.out.println("Hora inválida.");
                    valido = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Digite apenas números.");
                sc.next();
                valido = false;
            }
        } while (!valido);

        this.hora = h;
    }

    public void setMinuto() {
        Scanner sc = new Scanner(System.in);
        int mi = 0;
        boolean valido;

        do {
            valido = true;
            try {
                System.out.print("Digite o minuto: ");
                mi = sc.nextInt();
                if (!validar(this.hora, mi, this.segundo)) {
                    System.out.println("Minuto inválido.");
                    valido = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Digite apenas números.");
                sc.next();
                valido = false;
            }
        } while (!valido);

        this.minuto = mi;
    }

    public void setSegundo() {
        Scanner sc = new Scanner(System.in);
        int s = 0;
        boolean valido;

        do {
            valido = true;
            try {
                System.out.print("Digite o segundo: ");
                s = sc.nextInt();
                if (!validar(this.hora, this.minuto, s)) {
                    System.out.println("Segundo inválido.");
                    valido = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Digite apenas números.");
                sc.next();
                valido = false;
            }
        } while (!valido);

        this.segundo = s;
    }

    public int getHora() {
        return this.hora;
    }

    public int getMinuto() {
        return this.minuto;
    }

    public int getSegundo() {
        return this.segundo;
    }

    public String mostra() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    private boolean validar(int h, int mi, int s) {
        return h >= 0 && h <= 23 && mi >= 0 && mi <= 59 && s >= 0 && s <= 59;
    }
}