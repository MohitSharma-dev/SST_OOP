package ConstructorChaining;

public class C extends B{
    C(){
        System.out.println("Consrtuctor of C is called");
    }
    C(String name){
        this();
        System.out.println("Consrtuctor of C is called " + name);
    }
}
