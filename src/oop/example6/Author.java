package oop.example6;

public class Author {
    String authorName;

    public Author(String authorName) {
        this.authorName = authorName;
    }

    public void show(){
        System.out.println("Имя автора: " + authorName);
    }
}
