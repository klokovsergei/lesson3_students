package less3_student.model;

import less3_student.util.StudentGroupIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student> {
    private static int countGroup = 1;
    private int idGroup;
    private List<Student> studentGroup;

    public StudentGroup() {
        this.idGroup = countGroup++;
        this.studentGroup = new ArrayList<>();
    }

    public void addStudent(Student student){
        studentGroup.add(student);
    }
    public boolean dellStudent(Student student){
        int indexStudent = studentGroup.indexOf(student);
        if ( indexStudent >= 0){
            studentGroup.remove(indexStudent);
            return true;
        } else
            return false;

    }
    public List<Student> getStudentGroup(){
        return studentGroup;
    }

    @Override
    public String toString(){
        return "В группе #" + idGroup + " учатся студенты: " + studentGroup.toString();
    }
    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }
}
