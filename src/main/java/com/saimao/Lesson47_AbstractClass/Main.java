package com.saimao.Lesson47_AbstractClass;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.init();
    }

    private void init() {
        speak(new Dog());
        speak(new Cat());
    }

    private void speak(Animal animal) {
        animal.makeSound();
    }

}
