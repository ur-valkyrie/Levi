package oop.example7;

public class Main
{
    public static void main(String[] args) {
          DerivedClass2 derivedClass2Instance =
                  new DerivedClass2();

          DerivedClass derivedClass =
                  (DerivedClass) derivedClass2Instance;

          if (derivedClass instanceof DerivedClass2){

          }
    }
}
