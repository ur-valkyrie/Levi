package oop.example8;

public class Dog implements Animal
{
    @Override
    public void born() {
        System.out.println("Живородящий");
    }

    @Override
    public void bloodTemp() {
        System.out.println("Теплокровный");
    }

    @Override
    public void name() {
        System.out.println("Собака :)");
    }
}
