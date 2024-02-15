package IntroToOOP;

public class Student {
    public String name;
    protected double psp;
    private String password;
    String email;
    int rollNo;
    Batch batch;

    public Student(){
        psp = 100.0;
//        batch = "temp batch";
        email = "xyz@email.com";
    }

    public Student(String email){
//        email = email;
        this.email = email;
    }
    void login(){
        System.out.println("Student logged in!");
    }

    void solveAssignment(){
        System.out.println("Solved assignments");
    }

    public String getPassword(){
        return this.password;
    }

    void setPassword(String new_pass){
        this.password = new_pass;
    }
}
