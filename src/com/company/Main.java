package com.company;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class Main {

    Map<Socket, Integer> requests = new HashMap<>();

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(6780);
            System.out.println();
            Socket socket = serverSocket.accept();
        } catch (Exception exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }
}
