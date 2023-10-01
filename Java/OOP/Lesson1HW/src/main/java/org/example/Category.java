package org.example;

public class Category
{
    public Category(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    protected String nameCategory;

    public Category() {
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    @Override
    public String toString() {
        return "Category{" +
                "nameCategory='" + nameCategory + '\'' +
                '}';
    }
}
