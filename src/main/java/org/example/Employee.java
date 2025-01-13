package org.example;

public class Employee {
    private int id;
    private String fullName;
    private String email;
    private String password;
    private  String[] healthPlans;

    public Employee(int id, String fullName, String email, String password, String [] healthPlans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthPlans = healthPlans;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getHealthPlans() {
        return healthPlans;
    }

    public void addHealthPlan(int index, String name) {
        if (index >= 0 && index < healthPlans.length) {
            if (healthPlans[index] == null) {
                healthPlans[index] = name;
                System.out.println("Healthplan added: " + name);
            } else {
                System.out.println("Healthplan at index " + index + " is already occupied.");
            }
        } else {
            System.out.println("Invalid index.");
        }
    }

    @Override
    public String toString() {
        StringBuilder healthPlansList = new StringBuilder();
        for (String plan : healthPlans) {
            if (plan != null) {
                healthPlansList.append(plan).append(" ");
            }
        }
        return "Employee{id=" + id + ", fullName='" + fullName + "', email='" + email + "', healthPlans=" + healthPlansList.toString() + "}";
    }
}
