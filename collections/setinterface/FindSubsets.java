package com.bridgelabz.collections.setinterface;

import java.util.HashSet;
import java.util.Set;

public class FindSubsets {
    public static void main(String[] args) {

        Set<Integer> setOne = new HashSet<>();
        setOne.add(2);
        setOne.add(3);

        Set<Integer> setTwo = new HashSet<>();
        setTwo.add(1);
        setTwo.add(2);
        setTwo.add(3);
        setTwo.add(4);

        if(setOne.containsAll(setTwo) || setTwo.containsAll(setOne)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
