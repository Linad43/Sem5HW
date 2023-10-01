package org.example;

public class Product extends Category
{
    private String name;
    private double price;
    private double rating;

    public Product(String nameCategory, String name, double price, double rating) {
        super(nameCategory);
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public Product(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                ", nameCategory='" + nameCategory + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price<0)
        {
            throw new IllegalArgumentException("Неверное значение цены");
        }
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if (rating<0||rating>5)
        {
            throw new IllegalArgumentException("Неверное значение рейтинга");
        }
        this.rating = rating;
    }
}
