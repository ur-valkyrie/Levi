package oop.example11;

public class ProDocumentWorker extends DocumentWorker{
    @Override
    void editDocument(){
        System.out.println("Документ отредактирован");
    }

    @Override
    void saveDocument() {
        System.out.println("Документ сохранен в старом формате, " +
                "для сохранения в другом, используйте Эксперт-версию");
    }
}
