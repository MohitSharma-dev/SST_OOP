package accessModifiers;

import IntroToOOP.Student;

public class Client {
    public static void main(String[] args) {
        Student st1 = new Student();
        // public can be accessed anywhere
        st1.name = "";
        // protected can be accessed within the same package
        // outside the package : child => This is not a child class
//        st1.psp = 90.0;
        // default can only be accessed within the same package
//        st1.email = "";
        // private can be accessed within Student class only
//        st1.password = "";
    }
}
