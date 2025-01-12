package org.example;

public class Employee {
    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthplans;

    public Employee(int id, String fullName, String email, String password, int healthplanCount) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthplans = new String[healthplanCount];
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
        return healthplans;
    }

    public void addHealthPlan(int index, String name) {
        if (index >= 0 && index < healthplans.length) {
            if (healthplans[index] == null) {
                healthplans[index] = name;
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
        StringBuilder healthplansList = new StringBuilder();
        for (String plan : healthplans) {
            if (plan != null) {
                healthplansList.append(plan).append(" ");
            }
        }
        return "Employee{id=" + id + ", fullName='" + fullName + "', email='" + email + "', healthplans=" + healthplansList.toString() + "}";
    }
}
