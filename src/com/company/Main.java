package com.company;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class Main {

    private static Map<Integer, Socket> requests = new HashMap<>();
    private static int id = 0;

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(6780);
            System.out.println();
            Socket socket = serverSocket.accept();
            requests.put(id, socket);
            id++;

        } catch (Exception exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }
}
