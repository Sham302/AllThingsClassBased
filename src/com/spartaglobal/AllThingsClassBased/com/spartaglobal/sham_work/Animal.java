package com.spartaglobal.AllThingsClassBased.com.spartaglobal.sham_work;

public abstract class Animal {
    private int numberOfLegs;
    private String mouth;
    private int numberOfEyes;

    public Animal(int numberOfLegs, String mouth, int numberOfEyes) {
        this.numberOfLegs = numberOfLegs;
        this.mouth = mouth;
        this.numberOfEyes = numberOfEyes;
    }

    public void breathe(){
        System.out.println("in and out");
    }

    public void eat(){
        System.out.println("nom nom");
    }

    public void sleep(){
        System.out.println("zzzz");
    }

    public void evacuate(){
        System.out.println("Braceee");
    }

    public void proCreate(){
        System.out.println("wocka wocka");

    }
}
