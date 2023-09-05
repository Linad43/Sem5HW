package Lesson3Game;

import java.io.*;
import java.io.File;
public class Answer {
    private String userInput;
    private Integer bull;
    private Integer cow;

    public Answer(String userInput, Integer bull, Integer cow) {
        this.userInput = userInput;
        this.bull = bull;
        this.cow = cow;
    }

    public Answer() {
    }

    public String getUserInput() {
        return userInput;
    }


    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }

    public Integer getBull() {
        return bull;
    }

    public void setBull(Integer bull) {
        this.bull = bull;
    }

    public Integer getCow() {
        return cow;
    }

    public void setCow(Integer cow) {
        this.cow = cow;
    }

    @Override
    public String toString() {
        String text = "You print '" + userInput + '\'' +
                ", " + bull +
                " bulls and " + cow +
                " cows";
        fileOut(text+"\n");
        return text;
    }
    public static void stringWord(String word)
    {
        String text = "Secret: " + word;
        fileOut(text+"\n");
        System.out.println(text);
    }
    public static void fileOut(String text)
    {
        try(FileOutputStream fos=new FileOutputStream("log.txt", true))
        {
            byte[] buffer = text.getBytes();
            fos.write(buffer, 0, buffer.length);
        }
        catch(IOException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
    public static void printLog()
    {
        try(FileInputStream fin=new FileInputStream("log.txt"))
        {
            int i;
            while((i=fin.read())!=-1){
                System.out.print((char)i);
            }
        }
        catch(IOException ex){
            System.out.println("Вы должны сыграть хотя бы раз");
        }
    }
    public static void cleanFille()
    {
        File file = new File("log.txt");
        file.delete();
    }
}
