package com.company;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.File;

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
