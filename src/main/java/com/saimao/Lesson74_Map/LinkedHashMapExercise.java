package com.saimao.Lesson74_Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
/*
Maintain insertion order
 */
public class LinkedHashMapExercise {
    public static void main(String[] args) {

        // Create (Add new elements into map)
        Map<String, String> dict = new LinkedHashMap<>();
        dict.put("apple", "ပန်းသီး");
        dict.put("orange", "လိမ္မော်သီး");
        dict.put("banana", "ငှက်ပျောသီး");
        dict.put("guava", "မာလကာသီး");
        dict.put("potato", "အာလူး");
        dict.put("tomato", "ခရမ်းချဉ်သီး");

        // Retrieve (Get element from map)
        System.out.println("Size : " + dict.size());
        System.out.println(dict.getOrDefault("apple", "default"));

        // Update (Update value in map)
        dict.replace("apple", "ပမ်ႈသီႈ");
        System.out.println(dict.get("apple"));

        System.out.println("Before update - " + dict.get("orange"));
        dict.put("orange", "ဇီးသီး");
        System.out.println("After update - " + dict.get("orange"));

        // Remove
        System.out.println("Before delete - " + dict.size());
        dict.remove("orange");
        System.out.println("After delete - " + dict.size());

        // Loop key
        for (String key : dict.keySet()) {
            System.out.printf("Key - %s ; Value - %s%n", key, dict.get(key));
        }

        // Loop value
        for (String value : dict.values()) {
            System.out.println(value);
        }

        for (Map.Entry<String, String> entry : dict.entrySet()) {
            System.out.println("Key : " + entry.getKey());
            System.out.println("Value : " + entry.getValue());
        }

    }
}
