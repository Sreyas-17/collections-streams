package com.bridgelabz.collections.setinterface;

import java.util.HashSet;
import java.util.Set;

public class UnionAndIntersection {
    public static void main(String[] args) {

        Set<Integer> setOne = new HashSet<>();
        Set<Integer> setTwo = new HashSet<>();

        setOne.add(1);
        setOne.add(2);
        setOne.add(3);

        setTwo.add(3);
        setTwo.add(4);
        setTwo.add(5);

        Set<Integer>unionSet = new HashSet<>();
        unionSet.addAll(setOne);
        unionSet.addAll(setTwo);
        System.out.println(unionSet);

        Set<Integer>intersectionSet = new HashSet<>();
        intersectionSet.addAll(setOne);
        intersectionSet.retainAll(setTwo);
        System.out.println(intersectionSet);
    }
}
