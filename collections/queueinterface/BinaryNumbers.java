package com.bridgelabz.collections.queueinterface;

import java.util.*;
public class BinaryNumbers {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int n=scanner.nextInt();

        Queue <String> queue = new LinkedList<>();
        List <String> number = new ArrayList<>();

        queue.add("1");

        for(int i=0;i<n;i++){

            String firstNum=queue.remove();
            number.add(firstNum);
            queue.add(firstNum+"0");
            queue.add(firstNum+"1");
        }

        System.out.println(number);
        scanner.close();
    }
}
