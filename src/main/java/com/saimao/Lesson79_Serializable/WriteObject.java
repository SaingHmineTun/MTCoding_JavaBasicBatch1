package com.saimao.Lesson79_Serializable;

import java.io.*;

public class WriteObject {
    public static void main(String[] args) throws IOException {
        String message = """
                <html>
                    <head>
                        <title> Hello World</title>
                    </head>
                    <body>
                        <h1> Hello World</h1>
                    </body>
                </html>
                """;

        Person person = new Person("Sai Mao", 28);

        File file = new File("test.ser");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(person);
        }
        System.out.println("Write object success!");

    }
}


/*
When run the app, show these
1. Write file
2. Read file
3. Close

When select one, read user input and write it to file. RESTART
When select two, read already the written file. If file not found, restart.
When select three, close the loop
 */
