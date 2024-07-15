package com.saimao.Lesson57_Record;


public class Main {
    public static void main(String[] args) {
//        Person person = new Person("Sai Sai", 18);
//        Person person1 = new Person("Sai Sai", 18);
//        System.out.println(person);

        User user = new User("Sai Sai", 18);
        User user1 = new User("Sai Sai", 18);
        System.out.println(user + " : " + user1);
        System.out.println(user.equals(user1));
    }
}
