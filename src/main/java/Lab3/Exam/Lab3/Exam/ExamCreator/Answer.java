package Lab3.Exam.Lab3.Exam.ExamCreator;

public class Answer {
    String answer;
    boolean isRight;

    public Answer(String answer, boolean isRight) {
        this.answer = answer;
        this.isRight = isRight;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setRight(boolean right) {
        isRight = right;
    }

    public String getAnswer() {
        return answer;
    }

    public boolean isRight() {
        return isRight;
    }
}
