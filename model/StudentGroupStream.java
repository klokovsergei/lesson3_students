package less3_student.model;

import less3_student.util.StudentGroupComparator;
import less3_student.util.StudentGroupStreamIterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentGroupStream implements Iterable<StudentGroup>{
    private int id = 1;
    private String nameStream = "StudentStream_" + id++;
    public List<StudentGroup> studentGroupsStream = new ArrayList<>();
    public void addStrudentGroup(StudentGroup studentGroup){
        studentGroupsStream.add(studentGroup);
    }
    public void getShowSortSudentGroup(){
        Collections.sort(studentGroupsStream, new StudentGroupComparator());
        System.out.println(studentGroupsStream);
    }
    @Override
    public String toString(){
        return "В Потоке " + nameStream + " " + studentGroupsStream.size() + " студенческих групп.";
    }
    @Override
    public Iterator<StudentGroup> iterator() {
        return new StudentGroupStreamIterator(this.studentGroupsStream);
    }
}
