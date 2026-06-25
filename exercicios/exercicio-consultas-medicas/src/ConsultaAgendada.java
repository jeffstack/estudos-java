//Crie a classe ConsultaAgendada conforme especificado.
//Jefferson Nascimento dos Santos.

import java.util.Scanner;

public class ConsultaAgendada {

    private Data data;
    private Hora hora;
    private String nomePaciente;
    private static int quantidade = 0;
    private String nomeMedico;

    public ConsultaAgendada() {
        this.data = new Data();
        this.hora = new Hora();

        Scanner sc = new Scanner(System.in);
        System.out.print("Nome do paciente: ");
        this.nomePaciente = sc.nextLine();
        System.out.print("Nome do médico: ");
        this.nomeMedico = sc.nextLine();

        quantidade++;
    }

    public ConsultaAgendada(int h, int mi, int s, int d, int m, int a, String p, String med) {
        this.hora = new Hora(h, mi, s);
        this.data = new Data(d, m, a);
        this.nomePaciente = p;
        this.nomeMedico = med;
        quantidade++;
    }

    public ConsultaAgendada(Data d, Hora h, String p, String med) {
        this.data = d;
        this.hora = h;
        this.nomePaciente = p;
        this.nomeMedico = med;
        quantidade++;
    }

    public void setData(int a, int b, int c) {
        this.data = new Data(a, b, c);
    }

    public void setData() {
        this.data = new Data();
    }

    public void setHora(int a, int b, int c) {
        this.hora = new Hora(a, b, c);
    }

    public void setHora() {
        this.hora = new Hora();
    }

    public void setNomePaciente(String p) {
        this.nomePaciente = p;
    }

    public void setNomePaciente() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome do paciente: ");
        this.nomePaciente = sc.nextLine();
    }

    public void setNomeMedico(String m) {
        this.nomeMedico = m;
    }

    public void setNomeMedico() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome do médico: ");
        this.nomeMedico = sc.nextLine();
    }

    public static int getAmostra() {
        return quantidade;
    }

    public String getData() {
        return String.format("%02d/%02d/%02d", data.getDia(), data.getMes(), data.getAno() % 100);
    }

    public String getHora() {
        return String.format("%02d:%02d:%02d", hora.getHora(), hora.getMinuto(), hora.getSegundo());
    }

    public String getNomePaciente() {
        return this.nomePaciente;
    }

    public String getNomeMedico() {
        return this.nomeMedico;
    }
}