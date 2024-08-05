package com.saimao.Lesson81_ChatApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        Server server = new Server();
        server.init();
    }

    private BufferedReader reader;
    private PrintWriter writer;

    private void init() throws IOException {
        ServerSocket server = new ServerSocket(5432);
        while (true) {
            System.out.println("Server is listening on port 5432...");
            Socket socket = server.accept();
            System.out.println("Client connected...");
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            writer = new PrintWriter(socket.getOutputStream(), true);
            startReaderThread();
            startWriterThread();
        }
    }

    private void startWriterThread() {
        Thread writerThread = new Thread(() -> {
            while (true) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Write your message...");
                String message = sc.nextLine();
                writer.println(message);
            }
        });
        writerThread.start();
    }

    private void startReaderThread() {

        Thread readerThread = new Thread(() -> {
            while (true) {
                String message = "";
                try {
                    message = reader.readLine();
                    System.out.println("Client : " + message);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        readerThread.start();
    }
}
