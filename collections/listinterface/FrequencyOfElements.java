package com.bridgelabz.collections.listinterface;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElements {
    public static void main(String[] args) {

        String[] words=new String[]{"apple","banana","apple","orange"};
        Map<String, Integer> map=new HashMap<>();

        for(int i=0;i<words.length;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }

        for(Map.Entry<String,Integer> entry:map.entrySet() ){
            System.out.println (entry.getKey()+" "+entry.getValue());
        }

    }
}
