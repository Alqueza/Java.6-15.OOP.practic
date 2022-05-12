package com.company;

public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void hunting(){
        System.out.println(name+" hunting of something");
    }

    @Override
    public String toString() {
        return "Animal name:"+name;
    }
}
