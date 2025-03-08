package com.bridgelabz.collections.listinterface;

import java.util.*;
import java.util.Scanner;

public class RotateElements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rotations: ");
        int rotations = scanner.nextInt();

        List<Integer> list=new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        for(int i=0;i<=rotations;i++){
            list.addFirst(list.get(list.size()-1));
            list.remove(list.size()-1);
        }
        System.out.println(list);
    }
}
