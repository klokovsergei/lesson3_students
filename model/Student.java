package less3_student.model;

public class Student extends User{
    private static int countID;
    private String spesialization;

    public Student(String name, String lastName, String spesialization) {
        this.name = name;
        this.lastName = lastName;
        this.spesialization = spesialization;
        this.id = countID++;
    }
    public Student(String name, String lastName){
        this(name, lastName, "");
    }

    public String getSpesialization() {
        return spesialization;
    }

    @Override
    public String toString() {
        return "Student{" +
                " id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                "spesialization='" + spesialization + '\'' +
                '}';
    }
}
