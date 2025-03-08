package com.bridgelabz.collections.mapinterface;

import java.util.*;

public class MergeTwoMaps {
    public static void main(String[] args){

        HashMap <String,Integer> mapOne  =new HashMap<>();
        mapOne.put("A",1);
        mapOne.put("B",2);

        HashMap <String,Integer> mapTwo  =new HashMap<>();
        mapTwo.put("B",3);
        mapTwo.put("C",4);

        HashMap <String,Integer> merge  =new HashMap<>(mapOne);
        for(Map.Entry<String,Integer> entry: mapTwo.entrySet()){
            merge.put(entry.getKey(), merge.getOrDefault(entry.getKey(),0)+entry.getValue());
        }

        System.out.println(merge);
    }
}
