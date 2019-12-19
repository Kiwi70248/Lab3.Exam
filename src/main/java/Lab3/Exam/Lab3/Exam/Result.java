package Lab3.Exam.Lab3.Exam;

class Result{
    String examName;
    Integer trueAns;
    String id;

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public Integer getTrueAns() {
        return trueAns;
    }

    public void setTrueAns(Integer trueAns) {
        this.trueAns = trueAns;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Result{" +
                "examName='" + examName + '\'' +
                ", trueAns=" + trueAns +
                ", id='" + id + '\'' +
                '}';
    }
}
