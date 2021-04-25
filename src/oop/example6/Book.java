package oop.example6;

public class Book {
    Author author;
    Title title;
    Content content;

    public Book(Author author, Title title, Content content) {
        this.author = author;
        this.title = title;
        this.content = content;
    }

    public void show(){
        System.out.println("Информация о книге: ");
        author.show();
        title.show();
        content.show();
    }
}
