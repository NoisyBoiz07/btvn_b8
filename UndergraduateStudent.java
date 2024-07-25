package btvn_b8;

public class UndergraduateStudent extends Student {
    private String Major;
    public UndergraduateStudent(String StudentID, String Name, int Age, String Major) {
        super(StudentID, Name, Age, Major);
        this.Major = Major;
    }
    @Override
    public double CalculateGPA() {
        return 3.0;
    }
    public String toString(){
        return super.toString() + ", Major: " + Major + ", GPA: " + CalculateGPA();
    }
}
