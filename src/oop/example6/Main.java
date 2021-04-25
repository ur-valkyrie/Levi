package oop.example6;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Герберт Шилдт");
        Title title = new Title("C# Руководство для начинающих");
        Content content = new Content("Java - это круто, но C# круче :)");

        Book book = new Book(author, title, content);
        book.show();
    }
}
