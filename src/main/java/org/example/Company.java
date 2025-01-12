package org.example;

public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(int id, String name, double giro, int developerCount) {
        this.id = id;
        this.name = name;
        this.giro = giro > 0 ? giro : 0;  // Giro negatif olamaz
        this.developerNames = new String[developerCount];
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGiro() {
        return giro;
    }

    public void setGiro(double giro) {
        this.giro = giro > 0 ? giro : 0;  // Giro negatif olamaz
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void addEmployee(int index, String name) {
        if (index >= 0 && index < developerNames.length) {
            if (developerNames[index] == null) {
                developerNames[index] = name;
                System.out.println("Employee added: " + name);
            } else {
                System.out.println("Employee at index " + index + " is already occupied.");
            }
        } else {
            System.out.println("Invalid index.");
        }
    }

    @Override
    public String toString() {
        StringBuilder developerList = new StringBuilder();
        for (String dev : developerNames) {
            if (dev != null) {
                developerList.append(dev).append(" ");
            }
        }
        return "Company{id=" + id + ", name='" + name + "', giro=" + giro + ", developers=" + developerList.toString() + "}";
    }
}
