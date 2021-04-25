package oop.example12;

public class ExcelentPupil implements Pupil {
    @Override
    public void study() {
        System.out.println("Учится отлично");
    }

    @Override
    public void read() {
        System.out.println("Читает лучше всех");
    }

    @Override
    public void write() {
        System.out.println("Пишет выше среднего, красиво");
    }

    @Override
    public void relax() {
        System.out.println("Не отдыхает");
    }
}
