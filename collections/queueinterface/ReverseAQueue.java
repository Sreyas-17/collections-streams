package com.bridgelabz.collections.queueinterface;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseAQueue {
    public static void reverse(Queue<Integer> queue) {

        int front = queue.remove();

        if(!queue.isEmpty()){
            reverse(queue);
        }
        queue.add(front);

    }
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        reverse(queue);

        System.out.println(queue);
    }
}
