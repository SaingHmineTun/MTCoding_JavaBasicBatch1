package com.saimao.Lesson78_ReadFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadWithScanner {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\Sai Mao\\Desktop\\Teach Python.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
}
