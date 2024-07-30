package com.saimao.Lesson70_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(); // Upcasting
        // CRUD -> Create, Read, Update, Delete
        // Add new data into List
        System.out.println("Before adding : " + names.size());
        names.add("Luffy");
        names.add("Zoro");
        names.add("Sanji");
        names.add(2, "Nami");
        System.out.println("After adding : " + names.size());

        // Read data from list
        System.out.println("Index Zero - " + names.get(0));
        System.out.println("Index Two - " + names.get(2));

        // Update data in list
        names.set(2, "Usopp");
        System.out.println(names.get(2));

        // Delete data from list
        System.out.println("Before delete - " + names.size());
        names.remove(3);
        System.out.println("After delete - " + names.size());

        // Index Of
        System.out.println("Index of Luffy - " + names.indexOf("Zoro"));

        // Contains
        System.out.println("Does list contain zoro - " + names.contains("Zoro"));

        for (String name : names) {
            System.out.println(name);
        }

    }
}
