package com.bridgelabz.collections.setinterface;

import java.util.*;

public class ComparisonOfTwoSets {
    public static void main(String[] args) {
        Set<Integer> setOne = new HashSet<>();
        Set<Integer> setTwo= new HashSet<>();

        setOne.add(1);
        setOne.add(2);
        setOne.add(3);
        setOne.add(4);

        setTwo.add(4);
        setTwo.add(3);
        setTwo.add(2);
        setTwo.add(1);

        System.out.println(setOne.equals(setTwo));

    }
}

