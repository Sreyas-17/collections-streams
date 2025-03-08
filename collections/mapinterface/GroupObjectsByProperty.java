package com.bridgelabz.collections.mapinterface;

import java.util.*;

class Employee{
    private String name;
    private String designation;
    public Employee(String name,String designation){
        this.name=name;
        this.designation=designation;
    }

    public String getName(){
        return name;
    }

    public String getDesignation(){
        return designation;
    }

    public String toString(){
        return name;
    }
}
public class GroupObjectsByProperty {
    public static void main(String[] args){

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", "HR"));
        employees.add(new Employee("Bob", "IT"));
        employees.add(new Employee("Carol", "HR"));

        Map<String, List<Employee>> map = new HashMap<>();

        for(Employee emp : employees) {
            map.putIfAbsent(emp.getDesignation(), new ArrayList<>());
            map.get(emp.getDesignation()).add(emp);
        }

        System.out.println(map);

    }
}
