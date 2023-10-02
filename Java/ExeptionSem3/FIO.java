package org.example;

import java.util.regex.Pattern;

public class FIO {
    private String name;
    private String fam;
    private String lastName;
    private String data;
    private String numPhone;
    private String gender;
    //private String regexName = "\\w{1,}";
    private String regexData = "\\d{2}.\\d{2}.\\d{4}";

    public FIO(String name, String fam, String lastName, String data, String numPhone, String gender) {
        setName(name);
        //this.name = name;
        setFam(fam);
        //this.fam = fam;
        setLastName(lastName);
        //this.lastName = lastName;
        setData(data);
        setNumPhone(numPhone);
        setGender(gender);
    }

    public FIO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (isLetter(name) && name.length()>1)
        {
            this.name = name;
        }
        else
        {
            throw new RuntimeException("Имя должно состоять только из букв");
        }
    }

    public String getFam() {
        return fam;
    }

    public void setFam(String fam) {
        if (isLetter(fam) && fam.length()>1)
        {
            this.fam = fam;
        }
        else
        {
            throw new RuntimeException("Фамилия должна состоять только из букв");
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (isLetter(lastName) && lastName.length()>1)
        {
            this.lastName = lastName;
        }
        else
        {
            throw new RuntimeException("Отчество должно состоять только из букв");
        }
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        if (Pattern.matches(regexData,data))
        {
            this.data = data;
        }
        else
        {
            throw new RuntimeException("Дата должна быть в формате дд.мм.гггг");
        }
    }

    public String getNumPhone() {
        return numPhone;
    }

    public void setNumPhone(String numPhone) {
        try
        {
            Long.valueOf(numPhone);
        }
        catch (Exception e)
        {
            throw new RuntimeException("Номер телефона должен состоять только из цифр");
        }
        this.numPhone = numPhone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        gender = gender.toUpperCase();
        if (gender.length()==1)
        {
            if (gender.equals("F") || gender.equals("M"))
            {
                this.gender = gender;
            }
            else
            {
                throw new RuntimeException("Пол может быть только f или m");
            }
        }
        else
        {
            throw new RuntimeException("Пол может состоять из одного символа");
        }
    }
    public boolean isLetter(String name) {
        char[] chars = name.toCharArray();
        for (char c : chars)
        {
            if(!Character.isLetter(c))
            {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "FIO{" +
                "name='" + name + '\'' +
                ", fam='" + fam + '\'' +
                ", lastName='" + lastName + '\'' +
                ", data='" + data + '\'' +
                ", numPhone='" + numPhone + '\'' +
                ", gender='" + gender + '\'' +
                ", regexData='" + regexData + '\'' +
                '}';
    }

}
