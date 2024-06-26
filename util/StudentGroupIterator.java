package less3_student.util;

import less3_student.model.StudentGroup;
import less3_student.model.Student;

import java.util.Iterator;

public class StudentGroupIterator implements Iterator<Student> {
    private StudentGroup studentGroup;
    private int index = 0;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    @Override
    public boolean hasNext() {
        return index < studentGroup.getStudentGroup().size();
    }

    @Override
    public Student next() {
        return studentGroup.getStudentGroup().get(index++);
    }

}
