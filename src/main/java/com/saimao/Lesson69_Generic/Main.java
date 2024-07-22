package com.saimao.Lesson69_Generic;

public class Main {
    public static void main(String[] args) {

        UserInt userInt = new UserInt();
        userInt.password = 123;

        UserString userString = new UserString();
        userString.password = "123";

        User<String> user = new User();
        user.setPassword("123");
        String password = user.getPassword();

        User<Integer> user1 = new User<>();
        user1.setPassword(123);
        int i = user.getInt(123);
        String str = user.getValue("true");

    }
}
