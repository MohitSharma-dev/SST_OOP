package Polymorphism;

public class Dog extends Animal implements Runner, Player{
    public void bark(){
        System.out.println("Dog is barking");
    }

    // Dog class would inherit following methods from the parent
//    public void walk(){
//        System.out.println("Animal is walking");
//    }
//
//    public void walk(int noOflegs){
//        System.out.println("Walking with x legs");
//    }
        // this is not allowed
//    public int walk(){
//
//    }

    // method overriding
    public void walk(){
        // dog says I will have my own walking style
        System.out.println("Dog is walking");
    }

    public void run() {
        System.out.println("Dog is running");
    }

    public void play() {

    }
}
//dog.walk();
// dog.run();
