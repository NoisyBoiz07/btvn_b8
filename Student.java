package btvn_b8;

abstract class Student {
    private String StudentID;
    private String Name;
    private int Age;
    public Student(String StudentID, String Name, int Age, String major){
        this.StudentID = StudentID;
        this.Name = Name;
        this.Age = Age;
    }

    public abstract double CalculateGPA();
    @Override
    public String toString() {
        return "Student ID: " + StudentID + ", Name: " + Name + ", Age: " + Age;
    }

}
