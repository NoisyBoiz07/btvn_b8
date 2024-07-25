package btvn_b8;
import java.util.ArrayList;
public class University {
    private ArrayList<Student> students;
    University(){
        students = new ArrayList<>();
    }
    public void addStudent(Student s){ students.add(s);}
    public void displayAllStudents() {
        for (Student s : students) {
            System.out.println(s.toString());
        }
    }

    public static void main(String[] args) {
        University university = new University();
        Student student1 = new InternationalStudent("20021603", "Vu", 22,"VietNam");
        Student student2 = new GraduateStudent("20021555", "Minh", 22,  "Danh gia hieu nang mang 5G");
        Student student3 = new UndergraduateStudent("20021566", "Phong", 22,"Dien tu vien thong");

        university.addStudent(student1);
        university.addStudent(student2);
        university.addStudent(student3);

        university.displayAllStudents();

    }
}
