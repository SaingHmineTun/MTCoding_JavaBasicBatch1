package com.saimao.Lesson52_InnerClass;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.setBrand("Oppo");
        phone.setName("F19");

        Phone.Cpu cpu = phone.new Cpu();
        cpu.setModel("Snapdragon 8101");
        cpu.printInfo();

    }
}
