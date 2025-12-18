package Lab5.Lab5P2;

import java.util.Scanner;

class Animal {
    protected String name;
    protected int age;

    public void makeSound() {
        System.out.println("I am an animal.");
    }
    public void displayinfo() {
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        Cat cat = new Cat();
        cat.name = name;
        cat.age = age;
        cat.displayinfo();
        cat.makeSound();
        sc.close();
    }
}
