package btvn_b8;

public class InternationalStudent extends UndergraduateStudent{
    private String Country;
    public InternationalStudent(String StudentID, String Name, int Age,String Country) {
        super(StudentID, Name, Age,Country);
        this.Country = Country;
    }
    @Override
    public double CalculateGPA() {
        return 3.0;
    }
    public String toString(){
        return super.toString() + "Country: " + Country + ", GPA: " + CalculateGPA();
    }
}
