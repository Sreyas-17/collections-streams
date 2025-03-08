package com.bridgelabz.collections.setinterface;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {
    public static void main(String[] args) {

        Set<Integer> setOne = new HashSet<>();
        setOne.add(1);
        setOne.add(2);
        setOne.add(3);

        Set<Integer> setTwo = new HashSet<>();
        setTwo.add(3);
        setTwo.add(4);
        setTwo.add(5);

        Set<Integer> unionSet = new HashSet<>(setOne);
        unionSet.addAll(setTwo);

        Set<Integer> intersectionSet = new HashSet<>(setOne);
        intersectionSet.retainAll(setTwo);

        Set<Integer> differenceSet = new HashSet<>(unionSet);
        differenceSet.removeAll(intersectionSet);

        System.out.println(differenceSet);

    }
}
