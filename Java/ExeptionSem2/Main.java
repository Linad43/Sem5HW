package org.example;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello world!");
        //Ex1();
        //Ex2();
        //Ex3();
        Ex4();
    }



    private static void Ex1()
    {
        float num = 0;
        boolean flag;
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Введите десятичное число: ");
            String buf = in.nextLine();
            System.out.println("Вы ввели: " + buf);
            try {
                num = Float.parseFloat(buf);
                flag = false;
            } catch (NumberFormatException e) {
                
                System.out.println("Некорректный ввод");
                flag = true;
            }
        } while (flag);
        in.close();
        System.out.println("Успешный ввод десятичного числа: " + num);
    }

    private static void Ex2() {
        double[] intArray = new double[]{1, 2, 3, 4, 5, 6, 7, 8};
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        }

    }
    public static void Ex3() throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }
    public static void printSum(Integer a, Integer b){
        System.out.println(a + b);
    }
    private static void Ex4() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку(не пустую):");
        String buf = in.nextLine();
        if (buf.isEmpty())
        {
            throw new RuntimeException("Некорректные данные");
        }
        System.out.println("Введено: " + buf);
        in.close();

        
    }


}