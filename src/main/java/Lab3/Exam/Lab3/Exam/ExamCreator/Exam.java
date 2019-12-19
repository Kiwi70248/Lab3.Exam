package Lab3.Exam.Lab3.Exam.ExamCreator;

import java.util.ArrayList;

public class Exam {
    String examName;
    ArrayList<Question> questions = new ArrayList<>();

    public Exam(String examName, ArrayList<Question> questions) {
        this.examName = examName;
        this.questions = questions;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }
}
