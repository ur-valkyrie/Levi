package oop.example6;

public class Title {
    String titleName;

    public Title(String titleName) {
        this.titleName = titleName;
    }

    public void show() {
        System.out.println("Название книги: " + titleName);
    }
}
