package com.bridgelabz.collections.listinterface;

import java.util.*;

public class ReverseAList {

    public static String findFromEnd(LinkedList<String> list, int N) {
        if (list == null || N <= 0) {
            return "Invalid Input";
        }

        var first = list.listIterator();
        var second = list.listIterator();

        for (int i = 0; i < N; i++) {
            if (!first.hasNext()) {
                return "N is larger than the list size";
            }
            first.next();
        }

        while (first.hasNext()) {
            first.next();
            second.next();
        }
        return second.next();
    }
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter index from the last: ");

        int N = scanner.nextInt();
        System.out.println(findFromEnd(list, N));
    }


}
