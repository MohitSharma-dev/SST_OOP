package IntroToOOP;

import java.util.Date;

public class Client {
    public static void main(String[] args) {
        Batch b = new Batch();
        b.name = "Class of 2028";

        Student s = new Student();
        s.batch = b;
        s.batch.start_date = new Date();
        Student s2 = new Student("abc@email.com");
        s.setPassword("pass");
        s.name = "Mohit";
        s.email = "mohit.sharma@scaler.com";
//        s.batch = "SST";
        s.rollNo = 1;
        // private members can't be accessed outside the class
//        s.password = "password";
        s.psp = 90.0;

        Student s1 = s;
        s1.name = "Akshay";
        System.out.println(s.name);
    }
}
