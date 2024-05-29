package com.saimao;
/*
Syntax : boolean && boolean = boolean
1. AND (&&) (both true then true)
    - true && true = true
    - false && true = false
    - true && false = false
    - false && false = false
2. OR (||) (either true then true)
    - true || true = true
    - true || false = true
    - false || true = true
    - false || false = false
3. NOT (!)
    - !true = false
    - !false = true
 */
public class Lesson11_LogicalOperator {
    public static void main(String[] args) {
        boolean first = 100 >= 101; // false
        boolean second = !(5 != 5); // true
        boolean and = first && second;
        boolean or = first || second;
        System.out.println("First : " + first);
        System.out.println("Second : " + second);
        System.out.println("AND : " + and);
        System.out.println("OR : " + or);
    }
}
