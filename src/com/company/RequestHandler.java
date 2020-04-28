package com.company;

import netscape.javascript.JSObject;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.File;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class RequestHandler implements Runnable {

    public RequestHandler(int id, File file) {
        try {
            JSONParser parser = new JSONParser();
            Object object = parser.parse(String.valueOf(file));
            JSONObject jsonObject = (JSONObject) object;

        } catch (Exception exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }

    @Override
    public void run() {

    }
}
