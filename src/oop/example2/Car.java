package oop.example2;

public class Car {
    // Цвет
    String color;

    // Марка автомобиля
    String mark;

    // Модель автомобиля
    String model;

    // Стоимость
    double cost;

    // Страна производитель
    String county;

    // Тип кузова
    String type;

    // Выводит на экран информацию о машине
    void showCarInfo() {
        // Выводим поля объекта car1 на экран
        System.out.println("Марка автомобиля: " + mark);
        System.out.println("Модель автомобиля: " + model);
        System.out.println("Цвет автомобиля: " + color);
        System.out.println("Тип кузова автомобиля: " + type);
        System.out.println("Страна производитель автомобиля: " + county);
        System.out.println("Цена автомобиля: " + cost);
        System.out.println("------------------------------------------------");
    }
}
