package com.saimao.Lesson78_ReadFile;

import java.io.*;

public class WriteWithBufferedWriter {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter message here!");
        String message = reader.readLine();

        writer.write(message);
        writer.close();

        System.out.println("Write file successfully!");

    }
}
