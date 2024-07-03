package com.saimao.Lesson40_AccessModifierAndEncap;

import com.saimao.Lesson40_AccessModifierAndEncap.models.User;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setName("Sai Sai");
        user.setAge(18);
        System.out.println(user);
    }
}
