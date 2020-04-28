package com.company;

import netscape.javascript.JSObject;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Base64;
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

    public void imgToJson(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bytes = new byte[(int) file.length()];
        fileInputStream.read(bytes);
        String encodedString = Base64.getEncoder().encodeToString(bytes);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("1", encodedString);
    }


    @Override
    public void run() {

    }
}
