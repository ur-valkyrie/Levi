package oop.example12;

public class BadPupil implements Pupil
{
    @Override
    public void study() {
        System.out.println("Учится плохо");
    }

    @Override
    public void read() {
        System.out.println("Читает плохо");
    }

    @Override
    public void write() {
        System.out.println("Пишет плохо");
    }

    @Override
    public void relax() {
        System.out.println("Отдыхает хорошо :)");
    }
}
