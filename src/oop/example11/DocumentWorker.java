package oop.example11;

public class DocumentWorker {
    void openDocument(){
        System.out.println("Документ открыт");
    }

    void editDocument(){
        System.out.println("Доступен для редактирования только в версии Про");
    }

    void saveDocument(){
        System.out.println("Сохранение доступно только в версии Про");
    }
}
