package btvn_b8;

public class GraduateStudent extends Student {
    private String researchTopic;
    public GraduateStudent(String StudentID, String Name, int Age, String researchTopic) {
        super(StudentID, Name, Age, researchTopic);
        this.researchTopic = researchTopic;
    }
    @Override
    public double CalculateGPA() {
        return 3.0;
    }
    public String toString(){
        return super.toString() + "ResearchTopic: " + researchTopic + ", GPA: " + CalculateGPA();
    }
}

