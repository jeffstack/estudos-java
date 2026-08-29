import exercicio03.Person;
import exercicio03.Staff;
import exercicio03.Student;

public class TesteExercicio03 {
    public static void main(String[] args) {
        System.out.println("===== TESTE DA CLASSE PERSON =====");
        Person person = new Person("João", "Rua A, 100");

        System.out.println("Nome: " + person.getName());
        System.out.println("Endereço: " + person.getAddress());
        person.setAddress("Rua B, 200");
        System.out.println("Novo endereço: " + person.getAddress());
        System.out.println("toString(): " + person.toString());

        System.out.println("\n===== TESTE DA CLASSE STUDENT =====");
        Student student = new Student(
                "Maria",
                "Rua C, 300",
                "Análise e Desenvolvimento de Sistemas",
                2026,
                850.50
        );

        System.out.println("Nome herdado: " + student.getName());
        System.out.println("Endereço herdado: " + student.getAddress());
        System.out.println("Curso: " + student.getProgram());
        System.out.println("Ano: " + student.getYear());
        System.out.println("Mensalidade: " + student.getFee());

        student.setAddress("Rua D, 400");
        student.setProgram("Sistemas de Informação");
        student.setYear(2027);
        student.setFee(900.00);

        System.out.println("Dados depois dos setters:");
        System.out.println("Endereço: " + student.getAddress());
        System.out.println("Curso: " + student.getProgram());
        System.out.println("Ano: " + student.getYear());
        System.out.println("Mensalidade: " + student.getFee());
        System.out.println("toString(): " + student.toString());

        System.out.println("\n===== TESTE DA CLASSE STAFF =====");
        Staff staff = new Staff(
                "Carlos",
                "Rua E, 500",
                "Instituto Federal",
                3500.00
        );

        System.out.println("Nome herdado: " + staff.getName());
        System.out.println("Endereço herdado: " + staff.getAddress());
        System.out.println("Escola: " + staff.getSchool());
        System.out.println("Pagamento: " + staff.getPay());

        staff.setAddress("Rua F, 600");
        staff.setSchool("Escola Técnica");
        staff.setPay(4200.00);

        System.out.println("Dados depois dos setters:");
        System.out.println("Endereço: " + staff.getAddress());
        System.out.println("Escola: " + staff.getSchool());
        System.out.println("Pagamento: " + staff.getPay());
        System.out.println("toString(): " + staff.toString());
    }
}