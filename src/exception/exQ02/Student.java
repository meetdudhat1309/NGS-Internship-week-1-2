package exception.exQ02;

class Student {
    String id;
    float timeToCompleteExam;

    public Student(String id, float timeToCompleteExam) {
        this.id = id;
        this.timeToCompleteExam = timeToCompleteExam;
    }

    public void submitDetails() throws InvalidIdException, ExamTimeExceedException {
        if (id == null) throw new InvalidIdException("Provide an ID of a student");
        if (timeToCompleteExam > 3) throw new ExamTimeExceedException("You have to complete your exam early");
    }
}
