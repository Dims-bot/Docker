package com.simbirsoft;

public class B extends A {
    public B() {
        this.speed=10;
        System.out.println("B");
        move();
    }

    public void move() {
        this.speed++;
        System.out.println(speed);
    }
}
