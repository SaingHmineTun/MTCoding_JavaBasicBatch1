package com.saimao.Lesson33_ArrayOfObjects;

public class Main {
    public static void main(String[] args) {

        FoodMenu hamburger = new FoodMenu();
        hamburger.name = "Hamburger";
        hamburger.price = 5000;

        FoodMenu hotdog = new FoodMenu();
        hotdog.name = "Hot dog";
        hotdog.price = 2000;

        FoodMenu[] foodMenus = {hamburger, hotdog};
        for (FoodMenu foodMenu : foodMenus) {
            System.out.println(foodMenu.name + " - " + foodMenu.price);
        }

    }
}
