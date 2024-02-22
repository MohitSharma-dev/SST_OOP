package Polymorphism;

public class AnimalUtil {
    public void printAnimalName(Animal animal){
        System.out.println(animal.name);
        animal.walk();
//        animal.bark();
    }
    // we don't need to write the below functions anymore

//    public void printAnimalName(Dog dog){
//
//    }
//
//   public void printAnimalName(Cat cat){
//
//    }
}
