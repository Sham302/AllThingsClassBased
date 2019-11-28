package com.spartaglobal.AllThingsClassBased.com.spartaglobal.sham_work;

public class Mammal extends Animal implements Bipeds{


    public Mammal(int numberOfLegs, String mouth, int numberOfEyes) {
        super(numberOfLegs, mouth, numberOfEyes);
    }

    @Override //overriding from the superclass
    public void eat() {
        System.out.println("pass the knife and fork");
    }

    @Override
    public void breathe() {
        System.out.println("in and out faster");
    }

    public void makeNoise(String noise){
        System.out.println(noise);
    }

    public void makeNoise(String noise, String makeItLouder){
        System.out.println(noise + " " + makeItLouder);
    }

    public void generateHeat(){
        System.out.println("going to run to warm up");
    }

    public void createMilk(){
        System.out.println("no need to go shops");
    }

    @Override
    public void walk() {

    }

    @Override
    public void run() {

    }

    @Override
    public String speed(String howFast) {
        return null;
    }
}
