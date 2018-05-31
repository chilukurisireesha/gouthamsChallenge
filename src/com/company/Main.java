package com.company;

public class Main {

    public static void main(String[] args) {
        /**
         1. Declares an abstract class named Animal with the
         implementations for getIsMammal() and getIsCarnivorous()
         methods, as well as an abstract method named
         getGreeting() .
         2. Creates Dog, Cow , and Duck objects.
         3. Calls the getIsMammal() , getIsCarnivorous() , and
         getGreeting() methods on each of these respective objects.
         Complete the code in the editor below by writing the following:
         1. Three classes named Dog , Cow , and Duck that inherit
         from the Animal class.
         2. No-argument constructors for each class that initialize the
         instance variables inherited from the superclass.
         3. Each class must implement the getGreeting() method:
         For a Dog object, this must return the string ruff .
         For a Cow object, this must return the string moo .
         For a Duck object, this must return the string quack .
         */

        Dog dog = new Dog();
        Cow cow = new Cow();
        Duck duck = new Duck();

        System.out.println("Dog is carnivorous: " + dog.getIsCarnivorous());
        System.out.println("Dog is mammal: " + dog.getIsMammal());
        dog.getGreeting();

        System.out.println("Cow is carnivorous: " + cow.getIsCarnivorous());
        System.out.println("Cow is mammal: " + cow.getIsMammal());
        cow.getGreeting();

        System.out.println("Duck is carnivorous: " + duck.getIsCarnivorous());
        System.out.println("Duck is mammal: " + duck.getIsMammal());
        duck.getGreeting();    }
}
