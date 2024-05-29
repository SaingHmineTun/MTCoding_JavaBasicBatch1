package com.saimao;
/*
Compare value
Syntax : int/double < int/double = boolean
1. ==
2. !=
3. >
4. <
5. >=
6. <=
 */
public class Lesson10_RelationalOperator {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        boolean isGreater;
        isGreater = x > y;
        boolean isLessThan = x < y;
        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println(isGreater);
        System.out.println("Is Less Than - " + isLessThan);
        System.out.println(10 <= y);
        System.out.println(x >= y);
    }
}
