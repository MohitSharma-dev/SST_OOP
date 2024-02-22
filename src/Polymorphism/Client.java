package Polymorphism;

import java.util.*;

public class Client {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.walk();
        // bark is not present in Animal
//        a.bark();

        // Parent class can refer to a child class obj
        Animal a1 = new Dog();
        // At compile time , it is resolved by looking at the refernce
        a1.walk();
        // even though Dog has this method
        // but at compilation, compiler will check against the ref
//        a1.bark();
        AnimalUtil temp = new AnimalUtil();
        System.out.println("Animal is passed");
        temp.printAnimalName(new Animal());
        System.out.println("Dog is passed");
        temp.printAnimalName(new Dog());
        System.out.println("Cat is passed");
        temp.printAnimalName(new Cat());
        Animal x = new Animal();
        x.walk();
        Dog d = new Dog();
        d.walk();
        d.walk(4);


        Animal t = new Dog();
        t.walk();
        // At compile time, the check happens against the ref
        // at run-time , the actual obj is used
        Cat c = new Cat();
        c.meow();
        c.meow("meow");
        c.meow(3);

        List<Integer> x1 = new ArrayList<>();
        List<Integer> x2 = new LinkedList<>();
        List<Integer> x3 = new Vector<>();
        List<Integer> x4 = new Stack<>();

        Queue<Integer> x5 = new LinkedList<>();

    }
}

// Method overloading : Compile time poly
// Method overriding  : Run time poly