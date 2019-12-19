package Lab3.Exam.Lab3.Exam;

import Lab3.Exam.Lab3.Exam.ExamCreator.Exam;
import Lab3.Exam.Lab3.Exam.ExamCreator.ExamCreator;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.context.Context;

import javax.servlet.http.HttpSession;
import java.util.*;

@RestController
public class MyController {
    private static Exam exam = ExamCreator.create();
    private static ArrayList<Result> results = new ArrayList<>();

    @GetMapping("/exam")
    public Exam getExamsNames() {
        return exam;
    }

    @PostMapping("/postResult")
    public void postResult(@RequestBody Result result) {
        results.add(result);
        for (Result resultFromList : results) {
            System.out.println(resultFromList);
        }
    }
}

