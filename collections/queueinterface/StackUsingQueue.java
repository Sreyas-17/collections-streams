package com.bridgelabz.collections.queueinterface;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

    static Queue<Integer> queueOne =new LinkedList<>();
    static Queue<Integer> queueTwo =new LinkedList<>();

    public static void enqueue(int data){
        while(!queueOne.isEmpty()){
            queueTwo.add(queueOne.poll());
        }

        queueOne.add(data);

        while(!queueTwo.isEmpty()){
            queueOne.add(queueTwo.poll());
        }

    }

    public static void dequeue(){
        System.out.println("The removed element is :"+queueOne.poll());
    }

    public static void main(String[] args){

        enqueue(1);
        enqueue(2);
        enqueue(3);
        dequeue();
    }
}
