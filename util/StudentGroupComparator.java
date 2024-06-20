package less3_student.util;

import less3_student.model.StudentGroup;
import less3_student.model.Student;

import java.util.Comparator;

public class StudentGroupComparator implements Comparator<StudentGroup> {
    @Override
    public int compare(StudentGroup o1, StudentGroup o2) {
        int index1 = 0;
        int index2 = 0;
        for (Student s: o1)
            index1++;
        for (Student s: o2)
            index2++;
        return index1 - index2;
    }
}
