package Lab3.Exam.Lab3.Exam.ExamCreator;

import java.util.ArrayList;

public class Question {
    String question;
    ArrayList<Answer> answers  = new ArrayList<>();

    public Question(String question, ArrayList<Answer> answers) {
        this.question = question;
        this.answers = answers;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswers(ArrayList<Answer> answers) {
        this.answers = answers;
    }

    public String getQuestion() {
        return question;
    }

    public ArrayList<Answer> getAnswers() {
        return answers;
    }
}
