package com.company;

public class Turtle extends Animal{
    public Turtle(String name) {
        super(name);
    }

    public Turtle() {
    }


    public void swim() {
        System.out.println(name + " swimming");
    }

    @Override
    public void hunting() {
        System.out.println(name+" hunting fish eggs");
        }

    @Override
    public String toString() {
        return super.toString();
    }
}
