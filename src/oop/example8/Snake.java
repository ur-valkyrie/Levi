package oop.example8;

public class Snake implements Animal {
    @Override
    public void born() {
        System.out.println("Кладут яйца");
    }

    @Override
    public void bloodTemp() {
        System.out.println("Холоднокровное");
    }

    @Override
    public void name() {
        System.out.println("Змея :D");
    }
}
