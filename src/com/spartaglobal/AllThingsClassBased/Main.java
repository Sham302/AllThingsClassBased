package com.spartaglobal.AllThingsClassBased;

import com.spartaglobal.AllThingsClassBased.com.spartaglobal.sham_work.Animal;
import com.spartaglobal.AllThingsClassBased.com.spartaglobal.sham_work.Humans;
import com.spartaglobal.AllThingsClassBased.com.spartaglobal.sham_work.Mammal;

public class Main {

    public static void main(String[] args) {
	/* ExampleClass exampleClass = new ExampleClass(5);
        System.out.println(exampleClass.getCount()); //change state of object
        exampleClass.setCount(10);
        exampleClass.doubleCount();
        System.out.println(exampleClass.getCount()); */

       // Animal bob = new Animal(4, "beak",2);
        Mammal will = new Mammal(2,"normal", 2);

        will.breathe();

        Humans Rob = new Humans(2, "one", 2);
        Rob.walk();
        Rob.eat();

    }
}
