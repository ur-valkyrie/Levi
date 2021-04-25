package oop.example3;

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

    // Создадим пользовательский конструктор класса Car,
    // Который будет вызыаться при создании объекта класса
    // В конструкторе будет описано каким образом создать объект
    Car(String _mark, String _model, String _color,
        String _type, String _county, double _cost) {
           mark = _mark;
           model = _model;
           color = _color;
           type = _type;
           county = _county;
           cost = _cost;
    }

    // Конструктор по-умолчанию
    // Его задача - проинициализвароть поля класса значениями по-умолчанию
    // Для численных - это 0, 0.0, false, '\0'
    // Для ссылочных - это null
    // Существует в том случае, если программсит явно не указал конструктор
    // Если программист описал хотя бы один конструктор, то конструктор по-умолчанию
    // необходимо создвать вручную
    Car(){

    }
}
