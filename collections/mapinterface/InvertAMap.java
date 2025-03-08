package com.bridgelabz.collections.mapinterface;

import java.util.*;

public class InvertAMap {
    public static void main(String[] args) {

        HashMap<Character, Integer> map = new HashMap<>();
        map.put('A', 1);
        map.put('B',2);
        map.put('C',1);

        HashMap<Integer,List<Character>> reverseMap=new HashMap<>();
        for(Map.Entry<Character,Integer> entry:map.entrySet()){

            reverseMap.putIfAbsent(entry.getValue(),new ArrayList<>());
            reverseMap.get(entry.getValue()).add(entry.getKey());

        }

        System.out.println(reverseMap);
    }
}
