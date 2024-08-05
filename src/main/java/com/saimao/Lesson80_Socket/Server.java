package com.saimao.Lesson80_Socket;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {

        ServerSocket server = new ServerSocket(5000);
        while (true) {
            System.out.println("Server is listening on port 5000");
            Socket socket = server.accept();
            OutputStream os = socket.getOutputStream();
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os));
            writer.append("Hello World");
            writer.newLine();
            writer.flush();
            System.out.println("Client connected!");
        }

    }

}
