package DeepvsShallow;

public class User {
    String name;
    private String password;
    String email;

    User(){
        System.out.println("This constructor is called");
        this.password = "pass";
    }
    public void login(){
        System.out.println("USer logged in!");
    }
}
