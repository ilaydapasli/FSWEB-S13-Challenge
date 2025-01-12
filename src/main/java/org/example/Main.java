package org.example;
import org.example.enums.Plan;



public class Main {

    public static void main(String[] args) {
        mainMethod();
    }

    public static void mainMethod() {
        // Healthplan oluşturma
        Employee employee1 = new Employee(101, "John Doe", "john.doe@example.com", "password123", 3);

        // Healthplan ekleme
        employee1.addHealthPlan(0, "Basic Health Plan");
        employee1.addHealthPlan(1, "Premium Health Plan");

        // Employee objesini yazdırma
        System.out.println(employee1);
    }
}
