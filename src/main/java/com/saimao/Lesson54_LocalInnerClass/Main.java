package com.saimao.Lesson54_LocalInnerClass;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.init();
    }

    private void init() {

        class Cat implements Animal {
            @Override
            public void makeSound() {
                System.out.println("Meow Meow");
            }
        }
        Cat cat = new Cat();
        speak(cat);

        Cat cat2 = new Cat();
        speak(cat2);
    }

    private void speak(Animal animal) {

    }


}
