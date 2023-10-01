package Lesson2HW;

import org.example.Animal;
import org.example.Dog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Moving> move = new ArrayList<Moving>();
        move.add(new Human("Stas", 2.13, 1200));
        move.add(new Human("Anton", 2.10, 1500));
        move.add(new Human("Katya", 1.93, 2200));
        move.add(new Human("Senya", 2.53, 1900));
        move.add(new Robot("NewRobot021", 1.90, 1100));
        move.add(new Cat("Murzik", 1.5, 3000));
//        ArrayList<Human> sportsmens = new ArrayList<Human>();
//        Arrays.asList(new Human("Stas", 2.13, 1200));
//        Arrays.asList(new Human("Anton", 2.10, 1500));
//        Arrays.asList(new Human("Katya", 1.93, 2200));
//        Arrays.asList(new Human("Senya", 2.53, 1900));
//        Arrays.asList(new Robot("NewRobot021", 1.90, 1100));
//        Arrays.asList(new Cat("Murzik", 1.5, 3000));
        ArrayList<Human> buf = (ArrayList<Human>) move.clone();
        System.out.println("Начался забег");
        int one=0,two=0,three=0;
        for (int distans = 1000; buf.size()>1; distans+=100)
        {
            for (int i = 0; i < buf.size(); i++)
            {
                if (!(Sportsmen.run((Moving) buf.get(i), distans)))
                {
                    if (buf.size()==3) {   three= move.indexOf(buf.get(i));   }
                    else if (buf.size()==2) {   two= move.indexOf(buf.get(i));     }
                    else if (buf.size()==1) {   one= move.indexOf(buf.get(i));     }
                    System.out.println(buf.get(i) + " выбыл");
                    buf.remove(buf.get(i));
                    continue;
                }
            }
        }

        System.out.println("По итогу забега");
        System.out.println(move.get(three) + " занял третье место");
        System.out.println(move.get(two) + " занял второе место");
        System.out.println(buf.get(0) + " занял первое место");

        System.out.println("Начались прыжки");
        one=0;
        two=0;
        three=0;
        buf= (ArrayList<Human>) move.clone();
        for (double height = 1; buf.size()>1; height+=0.01)
        {
            for (int i = 0; i < buf.size(); i++)
            {
                if (!(Sportsmen.jump((Moving) buf.get(i), height)))
                {
                    if (buf.size()==3) {   three= move.indexOf(buf.get(i));   }
                    else if (buf.size()==2) {   two= move.indexOf(buf.get(i));     }
                    else if (buf.size()==1) {   one= move.indexOf(buf.get(i));     }
                    System.out.println(buf.get(i) + " выбыл");
                    buf.remove(buf.get(i));
                    continue;
                }
            }
        }

        System.out.println("По итогу прыжков");
        System.out.println(move.get(three) + " занял третье место");
        System.out.println(move.get(two) + " занял второе место");
        System.out.println(buf.get(0) + " занял первое место");
    }
}
