package oop.example8;

public class Cat implements Animal {
    @Override
    public void born() {
        System.out.println("Живородящие");
    }

    @Override
    public void bloodTemp() {
        System.out.println("Теплокровное");
    }

    @Override
    public void name() {
        System.out.println("Кошка :)");
    }
}
