package com.bridgelabz.collections.listinterface;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("Elements in list before removing duplicates: ");
        System.out.println(list);

        Set<Integer> set = new LinkedHashSet<>();
        set.addAll(list);

        System.out.println("\nElements in set after removing duplicates: ");
        System.out.println(set);
    }
}
