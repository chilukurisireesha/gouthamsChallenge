package com.company;

public class Dog extends Animal implements IAnimal  {

    public Dog() {
    }

    @Override
    protected void getGreeting() {
        System.out.println("Ruff ruff ruff");
    }

    @Override
    public boolean getIsMammal() {
        return true;
    }

    @Override
    public boolean getIsCarnivorous() {
        return true;
    }


}
