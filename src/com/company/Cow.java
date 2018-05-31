package com.company;

public class Cow extends Animal implements IAnimal {

    public Cow() {
    }

    @Override
    public void getGreeting() {
        System.out.println("Moooo");

    }

    @Override
    public boolean getIsMammal() {
        return true;
    }

    @Override
    public boolean getIsCarnivorous() {
        return false;
    }
}
