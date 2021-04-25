package oop.example8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Snake snake = new Snake();
        Turtle turtle = new Turtle();

        Animal animalCat = (Animal) cat;
        Animal animalDog = (Animal) dog;
        Animal animalSnake = (Animal) snake;
        Animal animalTurtle = (Animal) turtle;

        Animal[] animals = new Animal[4];
        animals[0] = animalCat;
        animals[1] = animalDog;
        animals[2] = animalSnake;
        animals[3] = animalTurtle;

        for (int i = 0; i < animals.length; i++) {
            System.out.println("Животное №" + (i + 1) + ":");
            animals[i].born();
            animals[i].bloodTemp();
            animals[i].name();
        }
    }
}
