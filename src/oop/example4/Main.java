package oop.example4;

public class Main {
    public static void main(String[] args) {
        Recursion(0);
    }

    public static void Recursion(int n){
        ++n;
        System.out.println("Рекурсия номер - " + n);

        if (n < 10) {
            Recursion(n);
        }

        System.out.println("Рекурсия номер - " + n);
    }
}
