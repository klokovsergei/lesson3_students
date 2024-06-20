package less3_student.model;

import less3_student.util.StudentGroupIterator;

import java.util.Iterator;

public class StudentGroup implements Iterable<Student> {
    private static int id = 1;
    private String nameGroup = "StudentGroup_" + id++;
    public StringBuilder students = new StringBuilder();
    public void addStudent(Student student){
        students.append(student).append(" ");
    }

    @Override
    public String toString(){
        return "В группе " + nameGroup + " учатся студенты: " + students.toString();
    }
    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }
}
