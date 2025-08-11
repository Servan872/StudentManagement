import java.util.ArrayList;

public class StudentManagementSystem {
    private ArrayList<Student> students;
    private Integer id;

    public StudentManagementSystem() {
        students = new ArrayList<>();
        id = 1;
    }

    public void addStudent(String name, String surname, String email) {
        Student newStudent = new Student(id++, name, surname, email);
        students.add(newStudent);
        System.out.println("Student " + id + " has been added");
    }

    public void listStudents() {
        if (students.isEmpty()) {
            System.out.println("No students");
        } else {
            for (Student student : students) {
                System.out.println(student.toString());
            }
            System.out.println(students);
        }
    }

    public void updateStudent(Integer id, String name, String surname, String email) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                student.setName(name);
                student.setSurname(surname);
                student.setEmail(email);
                System.out.println("has been updated");
            }

        }
        System.out.println("Student not found");
    }

    public void deleteStudent(Integer id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                students.remove(student);
                System.out.println("Student " + id + " has been deleted");
                return;
            }
        }
        System.out.println("Student not found");
    }

}