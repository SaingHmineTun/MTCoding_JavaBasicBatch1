package com.saimao.Lesson75_Set;

import java.util.*;

public class HashSetExercise {
    public static void main(String[] args) {

        Set<String> names = new LinkedHashSet<>();
        names.add("Luffy");
        names.add("Zoro");
        names.add("Sanji");
        names.add("Nami");
        names.add("Robin");

        List<String> extras = new ArrayList<>();
        extras.add("Chopper");
        extras.add("Usopp");
        extras.add("Luffy");
        extras.add("Brook");

        // Union
//        names.addAll(extras);
//        for (String name : names) {
//            System.out.println(name);
//        }

//        names.retainAll(extras);
//        for (String name : names) {
//            System.out.println(name);
//        }

        names.removeAll(extras);
        for (String name : names) {
            System.out.println(name);
        }


    }
}
