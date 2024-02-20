package ConstructorChaining;

public class D extends C{
    D(){
        super("Mohit");
        System.out.println("Consrtuctor of D is called");
    }
    D(String temp){
        this();
        System.out.println("D param");
    }
}

// types of inheritance
// Diamond Problem
