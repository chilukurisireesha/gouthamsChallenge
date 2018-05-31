package com.company;

public class Duck extends Animal implements IAnimal {

    public Duck() {
    }

    @Override
    public void getGreeting() {
        System.out.println("Quack quack quack");
    }

    @Override
    public boolean getIsMammal() {
        return false;
    }

    @Override
    public boolean getIsCarnivorous() {
        return false;
    }
}
