import java.util.*;

public class Hostel {
    private Map<Integer, Student> students = new HashMap<>();

    public void addStudent(Student s) {
        if (students.containsKey(s.getId())) {
            System.out.println("Student already exists.");
        } else {
            students.put(s.getId(), s);
            System.out.println("Student added.");
        }
    }

    public void viewAll() {
        if (students.isEmpty()) {
            System.out.println("No students.");
        } else {
            for (Student s : students.values()) {
                System.out.println(s);
            }
        }
    }

    public void removeStudent(int id) {
        if (students.remove(id) != null) {
            System.out.println("Student removed.");
        } else {
            System.out.println("Student not found.");
        }
    }
}
