package com.saimao.Lesson81_ChatApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Client client = new Client();
        client.init();
    }

    private BufferedReader reader;
    private PrintWriter writer;

    private void init() throws IOException {
        Socket socket = new Socket("127.0.0.1", 5432);
        reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        writer = new PrintWriter(socket.getOutputStream(), true);
        startReaderThread();
        startWriterThread();
    }

    private void startReaderThread() {

        new Thread(() -> {
            while (true) {
                String message = "";
                try {
                    message = reader.readLine();
                    System.out.println("Server : " + message);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }

    private void startWriterThread() {

        new Thread(() -> {
            while (true) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Write your message...");
                String message = sc.nextLine();
                writer.println(message);
            }
        }).start();
    }
}
