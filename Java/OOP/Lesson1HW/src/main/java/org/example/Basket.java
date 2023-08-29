package org.example;

public class Basket extends User {
    protected String name;


    public Basket() {
    }

    public Basket(String nameUser, String name) {
        super(nameUser);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "name='" + name + '\'' +
                ", nameUser='" + nameUser + '\'' +
                '}';
    }


    //static class Product{String name; double price; double ratin; String nameCategory;};

}
