package oop.example12;

public class GoodPupil implements Pupil {
    @Override
    public void study() {
        System.out.println("Учится хорошо");
    }

    @Override
    public void read() {
        System.out.println("Читает неплохо");
    }

    @Override
    public void write() {
        System.out.println("Пишет нормально");
    }

    @Override
    public void relax() {
        System.out.println("Отдыхает так себе");
    }
}
