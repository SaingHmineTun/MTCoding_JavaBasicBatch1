package com.saimao.Lesson44_DownAndUpCasting;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Child(); // Upcasting
        // Parent parent = new Daughter(); // ERROR
        print(parent);
    }

    private static void print(Parent parent) {
        if (parent instanceof Child) {
            Child child = (Child) parent; // Down-casting
            child.printChild();
        } else if (parent instanceof Daughter) {
            Daughter daughter = (Daughter) parent;
            daughter.printDaughter();
        }

        parent.printParent();
    }

}
