package org.example;

/**
 * 1)Создать класс Товар, имеющий переменные имя, цена, рейтинг.
 * 2)Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория.
 * 3)Создать класс Basket, содержащий массив купленных товаров.
 * 4)Создать класс User, содержащий логин, пароль и объект класса Basket. Создать несколько объектов класса User.
 * 5)Вывести на консоль каталог продуктов. (все продукты магазина)
 * 6)Вывести на консоль покупки посетителей магазина. (После покупки у пользователя добавляется товар, а из магазина - удаляется)
 */
public class Main
{
    public static void main(String[] args)
    {
        Category category1 = new Category("Продукты");
        Category category2 = new Category("Столовые принадлежности");
        Product product1 = new Product(category1.nameCategory,"Хлеб", 35.7, 3.4);
        Product product2 = new Product(category1.nameCategory,"Молоко", 120, 4.4);
        Product product3 = new Product(category1.nameCategory,"Масло", 350.2, 5.0);
        Product product4 = new Product(category2.nameCategory,"Кружка", 400, 3.8);
        Product product5 = new Product(category2.nameCategory,"Ложка", 70, 2.9);
        System.out.println("Категория 1: " + category1);
        System.out.println("Категория 2: " + category2);
        System.out.println("Товар 1: " + product1);
        System.out.println("Товар 2: " + product2);
        System.out.println("Товар 3: " + product3);
        System.out.println("Товар 4: " + product4);
        System.out.println("Товар 5: " + product5);
        User user1 = new User("Паша", "1234");
        Basket basket1 = new Basket(user1.getNameUser(), product1.getName());
        product1 = null;
        System.gc();
        Basket basket2 = new Basket(user1.getNameUser(), product3.getName());
        product3 = null;
        System.gc();
        System.out.println("Категория 1: " + category1);
        System.out.println("Категория 2: " + category2);
        System.out.println("Товар 1: " + product1);
        System.out.println("Товар 2: " + product2);
        System.out.println("Товар 3: " + product3);
        System.out.println("Товар 4: " + product4);
        System.out.println("Товар 5: " + product5);
        System.out.println("Товар 1 у покупателя: " + basket1);
        System.out.println("Товар 2 у покупателя: " + basket2);
    }
}