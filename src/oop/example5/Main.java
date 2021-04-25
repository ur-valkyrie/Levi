package oop.example5;

public class Main {
    public static void main(String[] args) {
        MyClass myInstance = new MyClass();

        System.out.println(myInstance.defaultField);       // будет работать
        System.out.println(myInstance.publicField);        // будет работать
        // System.out.println(myInstance.privateField);    // работать не будет
    }
}
