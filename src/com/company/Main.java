package com.company;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
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


            // modtager String fra netværk
            InputStreamReader isr = new InputStreamReader(socket.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(isr);

            String modtagetString = bufferedReader.readLine();

            // Laver string til JSON
            JSONParser parser = new JSONParser();
            Object object = parser.parse(modtagetString);
            JSONObject jsonObject = (JSONObject)object;



        } catch (Exception exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }
}
