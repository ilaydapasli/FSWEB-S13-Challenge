package org.example.enums;

public enum Plan {
    BASIC("A Sigorta",100.0);

    private String name;
    private Double price;


    Plan(String name, double price) {

        this.name=name;
        this.price=price;
    }
    public String getName(){
        return  name;

    }

    public double getPrice(){
        return  price;

    }

}
