package org.example;

public abstract class Animal
{
     protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
    }

    public abstract void animalInfo();
//    {
//        System.out.println("Животное " + name);
//    }

    public void voice()
    {
        System.out.println("Животное " + name + " издало звук");
    }

    public void jump()
    {
        System.out.println("Животное " + name + " выполнило прыжок");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
