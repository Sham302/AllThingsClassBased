package com.spartaglobal.AllThingsClassBased;

public class ExampleClass {

    private int count; // encapsulating the member variable,

    public ExampleClass(int countNum){ // constructor doesnt need a return type
    this.count = countNum;
    }

    public int getCount(){  //getter
        return count;
    }

    public void setCount(int countNum){ // setter
        this.count = countNum;
                // this. refers to this class
    }

    public void doubleCount(){ //method
        this.count = count *2;
    }
    public void newCount(int countNum){
        int newNum = countNum;
    }


}
