package org.example;

public class Main
{
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Cat cat1 = new Cat("Барсик", "Рыжий", 2);
        System.out.println("Cat1=" + cat1);
        Vector vector1 = new Vector(2, 5, 2);
        Vector vector2 = new Vector(1, 3, -3);
        System.out.println("Vector1=" + vector1);
        System.out.println("Vector2=" + vector2);
        System.out.println("length vector1=" + vector1.length());
        System.out.println("length vector2=" + vector2.length());
        System.out.println("scal proiz=" + vector1.scalProd(vector2));
        System.out.println("vector proiz=" + vector1.vecProd(vector2));
        cat1.animalInfo();

    }
}