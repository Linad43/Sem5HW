package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //FIO fio = new FIO("Даниил","Мерзликин","Андреевич","06.04.1997","79251309416","f");
        FIO fio = new FIO();
        ArrayList<String> text = new ArrayList<>();
        System.out.println("Введите через пробел данные:");
        try (Scanner in = new Scanner(System.in)) {
            text.addAll(Arrays.asList(in.nextLine().split(" ")));
            if (text.size()<6)
            {
                throw new RuntimeException("Данных меньше необходимого");
            }
            if (text.size()>6)
            {
                throw new RuntimeException("Данных больше необходимого");
            }
            for (String word:text) {
                System.out.print(word + " ");
            }
            System.out.println();
        }
        for(int setter = 1; setter <= 6; setter++) {
            for (int flag = 1, i = 0; flag == 1 && i < text.size(); i++) {
                try
                {
                    switch (setter)
                    {
                        case 1: {
                            fio.setFam(text.get(i));
                            break;
                        }
                        case 2: {
                            fio.setName(text.get(i));
                            break;
                        }
                        case 3: {
                            fio.setLastName(text.get(i));
                            break;
                        }
                        case 4: {
                            fio.setData(text.get(i));
                            break;
                        }
                        case 5: {
                            fio.setNumPhone(text.get(i));
                            break;
                        }
                        case 6: {
                            fio.setGender(text.get(i));
                            break;
                        }
                    }
                    text.remove(i);
                    flag = 0;
                }
                catch (Exception ignored) {}
                if (i==text.size()-1 && flag == 1)
                {
                    switch (setter)
                    {
                        case 1: {
                            fio.setFam(text.get(i));
                            break;
                        }
                        case 2: {
                            fio.setName(text.get(i));
                            break;
                        }
                        case 3: {
                            fio.setLastName(text.get(i));
                            break;
                        }
                        case 4: {
                            fio.setData(text.get(i));
                            break;
                        }
                        case 5: {
                            fio.setNumPhone(text.get(i));
                            break;
                        }
                        case 6: {
                            fio.setGender(text.get(i));
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(fio);

        try (BufferedWriter writter = new BufferedWriter(new FileWriter(fio.getFam() + ".txt",true))) {
            String line = fio.getFam() + " "
                    + fio.getName() + " "
                    + fio.getLastName() + " "
                    + fio.getData() + " "
                    + fio.getNumPhone() + " "
                    + fio.getGender();
                    writter.write(line + "\n");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}