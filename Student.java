
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Student {
    private String name;
    private Date dob;

    public Student(String name, String dob) throws ParseException {
        this.name = name;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        this.dob = dateFormat.parse(dob);
    }

    public int calculateAge() {
        // Calculate age based on current date (2024)
        int currentYear = 2024;
        int birthYear = Integer.parseInt(new SimpleDateFormat("yyyy").format(dob));
        return currentYear - birthYear;
    }

    public void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + calculateAge() + " years");
    }
    public static void main(String[] args) throws ParseException {
        // Example usage
        Student student = new Student("John Doe", "2000-05-15");
        student.displayStudentInfo();

        StudentCourses studentCourses = new StudentCourses();
        studentCourses.displayCourses();
    }
}

