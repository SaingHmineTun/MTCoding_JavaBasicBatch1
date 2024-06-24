package com.saimao.Lesson39_Constructor;

public class Main {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setAge(18);
        user1.setName("Nang");

        User user = new User("Sai Sai", 18);

        User[] users = {
                user1,
                new User("Ko KO", 22),
                new User("Aye Aye", 28),
                user
        };


        users[2].printInfo();

    }
}
