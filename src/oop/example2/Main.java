package oop.example2;

import oop.example2.Car;

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
        car1.showCarInfo();

        // Создаём ещё один объект класса Car
        Car car2 = new Car();
        car2.mark = "Lada";
        car2.model = "Priora";
        car2.color = "Black";
        car2.type = "Sedan";
        car2.county = "Ukraine";
        car2.cost = 10000; // $

        // Выводим поля объекта car2 на экран
        car2.showCarInfo();
    }
}
