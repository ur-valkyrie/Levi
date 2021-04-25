package oop.example9;

import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) {
        IPhone iPhone1 = new IPhone("6", 500);
        IPhone iPhone2 = new IPhone("6s", 600);
        IPhone iPhone3 = new IPhone("6s", 600);

        System.out.println("IPhone1 == IPhone2 = " + iPhone1.equals(iPhone2));
        System.out.println("IPhone2 == IPhone3 = " + iPhone2.equals(iPhone3));

        System.out.println(iPhone1.toString());
        System.out.println(iPhone2.toString());
        System.out.println(iPhone3.toString());
    }
}
