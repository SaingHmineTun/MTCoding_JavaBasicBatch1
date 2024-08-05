package com.saimao.Lesson78_ReadFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadWithBufferedReader {
    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\Sai Mao\\Desktop\\Teach Python.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();

    }
}
