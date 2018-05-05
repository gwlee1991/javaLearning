package com.company;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int brain, int body, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Chewed");
    }

    public void eat() {
        System.out.println("eat called");
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("dog walked");
        move(5);
    }

    public void run() {
        System.out.println("dog run");
        move(10);
    }
}
