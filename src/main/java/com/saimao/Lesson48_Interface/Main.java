package com.saimao.Lesson48_Interface;

public class Main {
    public static void main(String[] args) {
        Crocodile crocodile = new Crocodile();
        swim(crocodile);
        run(crocodile);
    }

    public static void swim(AquaticAnimal animal) {
        animal.swim();
    }

    public static void run(LandAnimal animal) {
        animal.run();
    }

}
