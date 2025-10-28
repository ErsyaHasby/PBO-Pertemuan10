import java.util.*;

public class Main {
    public static void main(String[] args) {

        // === TASK 1: ArrayList dan Sort by Name ===
        ArrayList<Student> studentList = new ArrayList<>();

        studentList.add(new Student(101, "Boaz", "Computer Science", "Papua"));
        studentList.add(new Student(102, "Ponaryo", "Mechanical Engineering", "Palembang"));
        studentList.add(new Student(103, "Kambuaya", "Computer Science", "Maluku"));
        studentList.add(new Student(104, "Konate", "Civil Engineering", "Bandung"));
        studentList.add(new Student(105, "Haye", "Accounting", "Semarang"));

        // Sort by name (ascending)
        Collections.sort(studentList, Comparator.comparing(Student::getName));

        System.out.println("=== Sorted Students (ArrayList) by Name ===");
        for (Student s : studentList) {
            System.out.println(s);
        }

        System.out.println();

        // === TASK 2: Vector dan Filter by Department ===
        Vector<Student> studentVector = new Vector<>();

        studentVector.add(new Student(201, "Shin Tae Yong", "Computer Science", "Korea"));
        studentVector.add(new Student(202, "Kluivert", "Business", "Belanda"));
        studentVector.add(new Student(203, "Bojan Hodak", "Computer Science", "Kroasia"));
        studentVector.add(new Student(204, "Aji Santoso", "Mechanical Engineering", "Indonesia"));
        studentVector.add(new Student(205, "Luis Milla Aspas", "Computer Science", "Spanyol"));

        System.out.println("=== Students in Computer Science Department (Vector) ===");
        for (Student s : studentVector) {
            if (s.getDepartment().equalsIgnoreCase("Computer Science")) {
                System.out.println(s);
            }
        }
    }
}
