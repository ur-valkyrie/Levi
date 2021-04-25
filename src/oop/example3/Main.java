package oop.example3;

public class Main {

    public static void main(String[] args) {
        // Car - это тип объекта
        // car1 - имя обхекта
        // new Car(...) - вызов пользовательского конструктора
        Car car1 = new Car("Ford", "Mondeo",
                "Black", "Sedan", "Germany", 20000);
        // Выводим поля объекта car1 на экран
        car1.showCarInfo();

        // Создаём ещё один объект класса Car
        Car car2 = new Car("Lada", "Priora", "Black",
                "Sedan", "Ukraine", 10000);
        // Выводим поля объекта car2 на экран
        car2.showCarInfo();
    }
}
