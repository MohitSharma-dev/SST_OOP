package Polymorphism;

public class Animal {
    String name;
    public void walk(){
        System.out.println("Animal is walking");
    }

    public void walk(int noOflegs){
        System.out.println("Animal is Walking with x legs");
    }
}
