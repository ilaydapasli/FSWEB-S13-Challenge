package org.example;
import org.example.enums.Plan;



public class Main {

    public static void main(String[] args) {
        mainMethod();
    }

    public static void mainMethod() {
        // Healthplan oluşturma
        Healthplan basicHealthplan = new Healthplan(1, "Basic Health Plan", Plan.BASIC);
        System.out.println(basicHealthplan);

        // Employee oluşturma
        Employee employee1 = new Employee(101, "John Doe", "john.doe@example.com", "password123", 3);
        employee1.addHealthplan(0, "Basic Health Plan");
        employee1.addHealthplan(1, "Premium Health Plan");
        System.out.println(employee1);

        // Company oluşturma
        Company company = new Company(1, "TechCorp", 500000, 3);
        company.addEmployee(0, "John Doe");
        company.addEmployee(1, "Jane Smith");
        System.out.println(company);
    }
}
