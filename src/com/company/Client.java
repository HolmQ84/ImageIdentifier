package com.company;

import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    try {

        Socket socket = new socket(InetAddress.getLocalHost().getHostAddress(), 6780);
        System.out.println("Connecting to server");
        PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
        printWriter.println("hello");



    } catch (Exception exception) {
        System.out.println("Error: " + exception.getMessage());
    }

}
