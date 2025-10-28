public class Student {
    private int studentID;
    private String name;
    private String department;
    private String address;

    // Constructor
    public Student(int studentID, String name, String department, String address) {
        this.studentID = studentID;
        this.name = name;
        this.department = department;
        this.address = address;
    }

    // Getter dan Setter (Encapsulation)
    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Untuk menampilkan data student
    @Override
    public String toString() {
        return studentID + " - " + name + " - " + department + " - " + address;
    }
}
