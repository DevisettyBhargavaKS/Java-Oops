package org.example.JavaOOps;

abstract class animal {
    private String name;

    public void Animal(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }
}

class dog extends animal {


    public void makeSound() {
        System.out.println("barking");

    }
}

public class Abstraction {
    public static void main(String[] args) {
        dog d = new dog();
        d.makeSound();
    }
}
