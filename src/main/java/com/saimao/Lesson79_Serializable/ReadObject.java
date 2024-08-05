package com.saimao.Lesson79_Serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("test.ser")))) {
            Person person = (Person) ois.readObject();
            System.out.println(person);
        }

    }
}
