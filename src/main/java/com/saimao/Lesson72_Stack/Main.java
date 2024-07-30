package com.saimao.Lesson72_Stack;

import java.util.Stack;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        Vector<String> vector = new Stack<>(); // Upcasting
        Stack<String> names = (Stack<String>) vector;
        // CRUD -> Create, Read, Update, Delete
        // Add new data into List
        System.out.println("Before adding : " + names.size());
        names.addElement("Luffy");
        names.push("Zoro");
        names.add("Sanji");
        names.insertElementAt("Nami", 2);
        System.out.println("After adding : " + names.size());

        // Read data from list
        System.out.println("Before peek - " + names.size());
        System.out.println("Peek - " + names.peek());
        System.out.println("After peek - " + names.size());

        System.out.println("Before pop - " + names.size());
        System.out.println("Pop - " + names.pop());
        System.out.println("After pop - " + names.size());

        // Update data in list
        names.set(2, "Usopp");
        System.out.println(names.get(2));

        // Delete data from list
        System.out.println("Before delete - " + names.size());
        names.removeElement("Sanji");
        System.out.println("After delete - " + names.size());
        System.out.println("############################");
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("############################");
        // Index Of
        System.out.println("Index of Luffy - " + names.indexOf("Luffy"));
        System.out.println("Search for Zoro - " + names.search("Zoro"));

        // Contains
        System.out.println("Does list contain zoro - " + names.contains("Zoro"));


    }
}
