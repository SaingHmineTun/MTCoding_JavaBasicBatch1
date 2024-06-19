package com.saimao.Lesson35_Method_Return_Type;

/*
1. Method return type
2. Method name
3. Method parameter
4. Method body
 */
public class Mathematics {
    int firstNumber;
    int secondNumber;

    void printInfo() {
        System.out.printf("First number - %d%nSecond number - %d%n", firstNumber, secondNumber);
    }

    int getFirstNumber() {
        System.out.println("Fetching first number...");
        return firstNumber;
    }

    int add() {
        return firstNumber + secondNumber;
    }

    int subtract() {
        return firstNumber - secondNumber;
    }

    int multiply() {
        return firstNumber * secondNumber;
    }

    int divide() {
        return firstNumber / secondNumber;
    }

    boolean isSimilar() {
        return firstNumber == secondNumber;
    }
}
/*
Person  ->   firstName, lastName
Scanner ->  Write down your first name (Sai)
            Write down your last name (Mg) (Sai Mg) (5)

loop -
    1. which name is longer (String) -> Sai
    2. is first name and last name equal (boolean) -> false
    3. get full name (String) ->
    4. how many characters in full name (int) ->
    5. Exit

 */