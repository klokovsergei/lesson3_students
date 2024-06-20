package less3_student.util;

import less3_student.model.StudentGroup;

import java.util.Iterator;
import java.util.List;

public class StudentGroupStreamIterator implements Iterator<StudentGroup> {
    private List<StudentGroup> studentGroups;
    private int index = 0;
    public StudentGroupStreamIterator(List<StudentGroup> studentGroups) {
        this.studentGroups = studentGroups;
    }
    @Override
    public boolean hasNext() {
        return index < studentGroups.size();
    }

    @Override
    public StudentGroup next() {
        return studentGroups.get(index++);
    }
}
