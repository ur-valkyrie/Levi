package oop.example6;

public class Content {
    String bookContent;

    public Content(String bookContent) {
        this.bookContent = bookContent;
    }

    public void show(){
        System.out.println("Содержание книги:" + bookContent);
    }
}
