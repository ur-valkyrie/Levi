package oop.example8;

public class Turtle implements Animal {
    @Override
    public void born() {
        System.out.println("Откладывают яйца");
    }

    @Override
    public void bloodTemp() {
        System.out.println("Холоднокровное");
    }

    @Override
    public void name() {
        System.out.println("Черепаха");
    }
}
