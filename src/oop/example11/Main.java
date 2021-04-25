package oop.example11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ключ доступа: ");
        String keyWord = scanner.next();
        DocumentWorker documentWorker;

        switch (keyWord) {
            case "pro":
                ProDocumentWorker proDocumentWorker =
                        new ProDocumentWorker();
                documentWorker = (DocumentWorker) proDocumentWorker;
                break;
            case "exp":
                ExpertDocumentWorker expertDocumentWorker =
                        new ExpertDocumentWorker();
                documentWorker = (DocumentWorker) expertDocumentWorker;
                break;
            default:
                documentWorker = new DocumentWorker();
                break;
        }

        documentWorker.openDocument();
        documentWorker.editDocument();
        documentWorker.saveDocument();
    }
}
