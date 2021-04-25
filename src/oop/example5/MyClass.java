package oop.example5;

public class MyClass {
    // Модификатора доступа:
    // - default - член класса доступен везде в пределах пакета
    // - public - член класса доступен везде в и за пределами пакета
    // - private - член класса доступен только внутри класса

    int defaultField; // Не указываем модификатор достпа, по-умолчанию - default
    public int publicField;
    private int privateField;
}