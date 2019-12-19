package Lab3.Exam.Lab3.Exam.ExamCreator;

import java.util.ArrayList;
import java.util.Random;

public class ExamCreator {

    static Random random = new Random();

    public static Exam create() {

        ArrayList<Question> questions = new ArrayList<>();

        for (int i = 0; i < (2 + random.nextInt(5)); i++) {
            ArrayList<Answer> answers = new ArrayList<>();
            Answer answer = new Answer("TRUE answer", true);
            answers.add(answer);

            for (int j = 0; j < (2 + random.nextInt(5)); j++) {
                Answer answerFalse = new Answer("answer"+j, false);
                answers.add(answerFalse);
            }

            Question question = new Question("Question"+i, answers);
            questions.add(question);
        }

        Exam exam = new Exam("EXAM1", questions);

        return exam;
    }
}
