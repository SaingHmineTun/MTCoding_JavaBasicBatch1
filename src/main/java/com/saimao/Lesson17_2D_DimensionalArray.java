package com.saimao;

public class Lesson17_2D_DimensionalArray {
    public static void main(String[] args) {
        int[][] numbers = {
                {100, 200, 300},
                {200, 400, 600},
                {300, 600, 900}
        };

        // Accessing value
        System.out.println(numbers[2][0]);

        // Updating value
        System.out.println("Before Updating : " + numbers[2][1]);
        numbers[2][1] = 650;
        System.out.println("After Updating : " + numbers[2][1]);
    }
}
