package com.bridgelabz.collections.queueinterface;

import java.util.PriorityQueue;

class Patient implements Comparable<Patient>{
    private String name;
    private int priority;

    public Patient(String name, int priority) {
        this.name=name;
        this.priority=priority;
    }

    public String getName(){
        return name;
    }

    public int getPriority(){
        return priority;
    }

    public int compareTo(Patient other) {
        return other.priority - this.priority;
    }

}
public class HospitalTriageSystem {
    public static void main(String[] args) {
        PriorityQueue<Patient> queue = new PriorityQueue<>();
        queue.add(new Patient("John", 3));
        queue.add(new Patient("Alice", 5));
        queue.add(new Patient("Bob", 2));

        while (!queue.isEmpty()) {
            Patient patient=queue.poll();
            System.out.println(patient.getName());
        }
    }
}
