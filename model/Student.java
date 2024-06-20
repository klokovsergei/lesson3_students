package less3_student.model;

public class Student implements Comparable<Student>{
    public String name;
    public final int id;
    private static int count = 1;

    public Student(String name) {
        this.name = name;
        this.id = count++;
    }

    @Override
    public String toString(){
        return "Student:" + name;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.length() - o.name.length();
    }
}
