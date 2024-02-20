package DeepvsShallow;

public class Student extends User{
    int age;
    double psp;
    int gradYear;
    Exam exam;
    Student(){
        this.age = 25;
        this.name = "Mohit";
        this.psp = 0.0;
        this.exam = new Exam();
//        this.password
    }
    Student(Student other){
        this.age = other.age;
        this.name = other.name;
        this.psp = other.psp;

//        this.exam = other.exam;

        this.exam = new Exam(other.exam);
//        this.exam.exam_id = other.exam.exam_id;
    }
}
