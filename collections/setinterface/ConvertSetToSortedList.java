package com.bridgelabz.collections.setinterface;

import java.util.*;

public class ConvertSetToSortedList {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(3);
        set.add(9);
        set.add(1);


        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        System.out.println(list);

//        Another method
//        Set<Integer> sortedSet = new TreeSet<>(set);
//        List<Integer> list = new ArrayList<>();
//        list.addAll(sortedSet);
//        System.out.println(list);

    }
}
