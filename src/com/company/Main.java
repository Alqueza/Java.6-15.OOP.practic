package com.company;

public class Main {

    public static void main(String[] args) {
        Animal[] animals = {new Shark("Shark"),
                new Turtle("Turtle"),
                new Eagle("Eagle")};

        for (Animal a : animals) {
            if (a.getClass().getName().equals("Animal.Shark")) {
                System.out.println(a);
            }

            if (a instanceof Shark) {
                System.out.println(a);
                ((Shark) a).attack();
                System.out.println();
            }

            if (a.getClass().getName().equals("Animal.Turtle")) {
                System.out.println(a);
            }

            if (a instanceof Turtle) {
                System.out.println(a);
                ((Turtle) a).swim();
                System.out.println();
            }

            if (a.getClass().getName().equals("Animal.Eagle")) {
                System.out.println(a);
            }

            if (a instanceof Eagle) {
                System.out.println(a);
                ((Eagle) a).fly();
                System.out.println();
            }
        }
    }
}
