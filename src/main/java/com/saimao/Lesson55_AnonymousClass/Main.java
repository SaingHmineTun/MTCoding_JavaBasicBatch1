package com.saimao.Lesson55_AnonymousClass;

public class Main {
    public static void main(String[] args) {

        Animal cat = new Animal() {
            @Override
            public void speak() {
                System.out.println("Meow Ooo");
            }
        };
        speak(cat);

        speak(new Animal() {
            @Override
            public void speak() {
                System.out.println("Woof Woof");
            }
        });

    }

    private static void speak(Animal animal) {
        animal.speak();
    }

}
