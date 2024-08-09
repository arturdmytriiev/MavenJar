package org.example;

import com.google.gson.Gson;

import java.util.HashMap;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("name","Vitya");
        map.put("surname","Getmasky");
        Gson gson = new Gson();
        String json = gson.toJson(map);
        System.out.println(json);
    }
}