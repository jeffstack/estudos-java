//Escreva todo o resultado obtido no exercício 3 em um arquivo texto.
//Jefferson Nascimento dos Santos.

import java.io.FileWriter;
import java.io.IOException;

public class TestaConsulta {

    public static void main(String[] args) throws IOException {

        System.out.println("=== Criando p1 com construtor parametrizado ===");
        ConsultaAgendada p1 = new ConsultaAgendada(14, 30, 0, 10, 6, 2025, "Carlos Silva", "Dra. Ana Souza");

        System.out.println("\n--- Dados de p1 ---");
        System.out.println("Data: " + p1.getData());
        System.out.println("Hora: " + p1.getHora());
        System.out.println("Paciente: " + p1.getNomePaciente());
        System.out.println("Médico: " + p1.getNomeMedico());

        System.out.println("\n=== Criando p2 com construtor padrão (digitação) ===");
        ConsultaAgendada p2 = new ConsultaAgendada();

        System.out.println("\n--- Dados de p2 ---");
        System.out.println("Data: " + p2.getData());
        System.out.println("Hora: " + p2.getHora());
        System.out.println("Paciente: " + p2.getNomePaciente());
        System.out.println("Médico: " + p2.getNomeMedico());

        System.out.println("\n=== Alterando dados de p1 via setters com digitação ===");
        p1.setData();
        p1.setHora();
        p1.setNomePaciente();
        p1.setNomeMedico();

        System.out.println("\n--- Dados de p1 atualizados ---");
        System.out.println("Data: " + p1.getData());
        System.out.println("Hora: " + p1.getHora());
        System.out.println("Paciente: " + p1.getNomePaciente());
        System.out.println("Médico: " + p1.getNomeMedico());

        System.out.println("\nQuantidade total de consultas: " + ConsultaAgendada.getAmostra());

        // Exercício 04 - gravando no arquivo
        FileWriter fw = new FileWriter("resultado.txt");

        fw.write("=== Dados de p1 (inicial) ===\n");
        fw.write("Data: 10/06/25\n");
        fw.write("Hora: 14:30:00\n");
        fw.write("Paciente: Carlos Silva\n");
        fw.write("Médico: Dra. Ana Souza\n");

        fw.write("\n=== Dados de p2 ===\n");
        fw.write("Data: " + p2.getData() + "\n");
        fw.write("Hora: " + p2.getHora() + "\n");
        fw.write("Paciente: " + p2.getNomePaciente() + "\n");
        fw.write("Médico: " + p2.getNomeMedico() + "\n");

        fw.write("\n=== Dados de p1 (atualizados) ===\n");
        fw.write("Data: " + p1.getData() + "\n");
        fw.write("Hora: " + p1.getHora() + "\n");
        fw.write("Paciente: " + p1.getNomePaciente() + "\n");
        fw.write("Médico: " + p1.getNomeMedico() + "\n");

        fw.write("\nQuantidade total de consultas: " + ConsultaAgendada.getAmostra() + "\n");

        fw.close();

        System.out.println("\nResultado gravado em resultado.txt");
    }
}