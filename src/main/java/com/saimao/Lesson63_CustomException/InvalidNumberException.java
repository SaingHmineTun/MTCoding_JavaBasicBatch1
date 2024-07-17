package com.saimao.Lesson63_CustomException;

public class InvalidNumberException extends Exception {

    public InvalidNumberException(String str) {
        super(str);
    }

}
