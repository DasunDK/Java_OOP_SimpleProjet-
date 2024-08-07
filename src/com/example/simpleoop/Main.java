package com.example.simpleoop;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Dasun", 22);
        Person person2 = new Person("Kavinda", 20);

        System.out.println(person1);
        System.out.println(person2);

        person1.setName("Kumara");
        System.out.println(person1.getName());

    }
}
