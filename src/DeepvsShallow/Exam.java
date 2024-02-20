package DeepvsShallow;

public class Exam {
    int exam_id;
    ReattemptExam reattemptExam;
    Exam(){
        this.exam_id = 45;
        this.reattemptExam = new ReattemptExam();
    }

    Exam(Exam other){
        this.reattemptExam = other.reattemptExam;
    }
}
