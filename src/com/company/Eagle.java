package com.company;

public class Eagle extends Animal{
    public Eagle(String name) {
        super(name);
    }

    public Eagle() {
    }

    public void fly(){
        System.out.println(name+" flying");
    }

    @Override
    public void hunting() {
        System.out.println(name+" hunting rabbits");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}