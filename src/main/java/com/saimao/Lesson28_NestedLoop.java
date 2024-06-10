package com.saimao;

import java.util.Random;

/*
a
#####
b
#####
 */
public class Lesson28_NestedLoop {
    public static void main(String[] args) {
        for (char ch = 'a'; ch <= 'z'; ch++) { // Outer Loop
            System.out.println(ch);
            for (int i = 0; i < 5; i++) { // Inner Loop
                System.out.print("#"); // #####
            }
            System.out.println();
        }
    }
}
/*

input - 5
*
**
***
****
*****

input - 3
*
**
***

input - 1
*

 */