package com.saimao.Lesson76_LambdaExpression;

public class Main {
    public static void main(String[] args) {

        clicked((x, y) -> {

        });

    }

    public static void clicked(OnClickListener listener) {
        listener.onClick(1, 2);
    }

}
