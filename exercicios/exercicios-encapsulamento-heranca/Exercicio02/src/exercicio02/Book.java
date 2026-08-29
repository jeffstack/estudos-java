package exercicio02;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    @Override
    public String toString() {
        String autoresTexto = "";

        for (int i = 0; i < authors.length; i++) {
            autoresTexto += authors[i];

            if (i < authors.length - 1) {
                autoresTexto += ",";
            }
        }

        return "Book[name=" + name + ",authors={" + autoresTexto
                + "},price=" + price + ",qty=" + qty + "]";
    }
}
