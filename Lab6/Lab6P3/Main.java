package Lab6.Lab6P3;

import java.util.Scanner;

interface ITexable {
    public double getTaxrate();
}

abstract class Product implements ITexable {
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public double calculatebasePrice() {
        return this.price;
    }
    public abstract double calculatefinalPrice();
}

class Book extends Product {
    public Book(String name, double price) {
        super(name, price);
    }
    public double getTaxrate() {
        return 0.07;
    }
    public double calculatefinalPrice() {
        return price + (price * getTaxrate());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        double price = sc.nextDouble();
        Book book = new Book(name, price);
        System.out.print(book.calculatefinalPrice());
        sc.close();
    }
}
