package DeepvsShallow;

public class Client {
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student(st1);
        st1.exam.exam_id = 30;
        st1.login();
        System.out.println("Hey!");
    }
}
