package Lab5.Lab5P1;

import java.util.Scanner;

class Animal {
    protected String name ;
    protected int age ;


    public void displayinfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        Dog dog = new Dog();
        dog.age = age;
        dog.name = name;
        dog.makeSound();
        dog.displayinfo();


        sc.close();
    }
}
