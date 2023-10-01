package org.example;

public class Teacher extends User{
     private String objectToTeach;
    private int rang;

    public Teacher(String name, String objectToTeach, int rang) {
        super(name);
        this.objectToTeach = objectToTeach;
        this.rang = rang;
    }

    public String getObjectToTeach() {
        return objectToTeach;
    }

    public void setObjectToTeach(String objectToTeach) {
        this.objectToTeach = objectToTeach;
    }

    public Teacher(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "objectToTeach='" + objectToTeach + '\'' +
                ", rang=" + rang +
                '}';
    }
}
