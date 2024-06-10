package com.saimao;

public class Lesson23_WhileLoop {
    public static void main(String[] args) {

        /*
        1. Initial Value
        2. Boolean Expression using that value
        3. Update that value
         */
        // 1. Initial Value
        int i = 0;
        // 2. Boolean Expression
        while (i < 10) {
            System.out.println(i);
            // 3. Update that value
            i += 2;
        }
        System.out.println("END OF LOOP!");
    }
}
/*
2, 4, 6, 8, 10
5, 4, 3, 2, 1
 */