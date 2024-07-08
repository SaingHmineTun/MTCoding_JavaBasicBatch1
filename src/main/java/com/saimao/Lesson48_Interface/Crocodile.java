package com.saimao.Lesson48_Interface;

/*
One class can implement multiple interfaces!
 */
public class Crocodile implements LandAnimal, AquaticAnimal {
    @Override
    public void makeSound() {
        System.out.println("Haha");
    }

    @Override
    public void swim() {
        System.out.println("Tail");
    }

    @Override
    public void run() {
        System.out.println("4 Legs");
    }
}
