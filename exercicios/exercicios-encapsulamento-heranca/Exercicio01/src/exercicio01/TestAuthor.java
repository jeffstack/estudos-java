package exercicio01;

public class TestAuthor {
    public static void main(String[] args) {
        Author autor = new Author(
                "Wellington Tuler",
                "tulermoraes@yahoo.com",
                'm'
        );

        System.out.println("Teste do construtor:");
        System.out.println(autor);

        System.out.println("\nTeste do toString():");
        System.out.println(autor.toString());

        System.out.println("\nTeste do setter de email:");
        autor.setEmail("novoemail@exemplo.com");
        System.out.println("Email alterado: " + autor.getEmail());

        System.out.println("\nTeste dos getters:");
        System.out.println("Nome: " + autor.getName());
        System.out.println("Email: " + autor.getEmail());
        System.out.println("Gênero: " + autor.getGender());
    }
}