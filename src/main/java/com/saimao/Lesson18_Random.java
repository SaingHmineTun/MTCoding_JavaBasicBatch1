package com.saimao;

import java.util.Random;

public class Lesson18_Random {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(6) + 1; // 1 - 6
        System.out.println(number);
    }
}
/*
HOMEWORK 1
Dice Rolling Game
Random - 1to6
Scanner - 1to6
Equal - WINNER
Not Equal - TRY AGAIN!

HOMEWORK 2
Grocery List
int[] fruits = {0, 0, 0, 0, 0};

Print -> Enter apple price
Scanner -> 500
Print -> Enter orange price
Scanner -> 1000

Total Expense -> 1500
 */
