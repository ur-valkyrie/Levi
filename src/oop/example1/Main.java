package oop.example1;

public class Main {

    public static void main(String[] args) {
        // Car - это тип объекта
        // car1 - имя обхекта
        // new Car() - вызов конструктора по-умолчанию (разберем позже)
        Car car1 = new Car();

        // На экран выведется 0, так как значение cost выставлено по-умолчанию равное 0.0
        // System.out.println("Цена автомобиля : " + car1.cost);

        // Инициализируем поля объекта car1 данными
        car1.mark = "Ford";
        car1.model = "Mondeo";
        car1.color = "Black";
        car1.type = "Sedan";
        car1.county = "Germany";
        car1.cost = 20000; // $

        // Выводим поля объекта car1 на экран
        System.out.println("Марка автомобиля: " + car1.mark);
        System.out.println("Модель автомобиля: " + car1.model);
        System.out.println("Цвет автомобиля: " + car1.color);
        System.out.println("Тип кузова автомобиля: " + car1.type);
        System.out.println("Страна производитель автомобиля: " + car1.county);
        System.out.println("Цена автомобиля: " + car1.cost);
        System.out.println("------------------------------------------------");

        // Создаём ещё один объект класса Car
        Car car2 = new Car();
        car2.mark = "Lada";
        car2.model = "Priora";
        car2.color = "Black";
        car2.type = "Sedan";
        car2.county = "Ukraine";
        car2.cost = 10000; // $

        // Выводим поля объекта car1 на экран
        System.out.println("Марка автомобиля: " + car2.mark);
        System.out.println("Модель автомобиля: " + car2.model);
        System.out.println("Цвет автомобиля: " + car2.color);
        System.out.println("Тип кузова автомобиля: " + car2.type);
        System.out.println("Страна производитель автомобиля: " + car2.county);
        System.out.println("Цена автомобиля: " + car2.cost);
    }
}
