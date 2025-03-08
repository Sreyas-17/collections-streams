package com.bridgelabz.collections.mapinterface;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class WordFrequencyCounter {
    public static void main(String[] args) {

        String filePath = "src/com/bridgelabz/searching/javaFile";
        HashMap<String, Integer> map = new HashMap<>();
        String[] arr;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                line = line.replaceAll("[^a-zA-Z ]", "").toLowerCase();
                arr = line.split(" ");
                for(int i=0;i<arr.length;i++){
                   map.put(arr[i],map.getOrDefault(arr[i],0)+1);
               }
            }
        }
        catch (IOException e) {
            System.out.println(e);
        }

        System.out.println(map);
    }
}
