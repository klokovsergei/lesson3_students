package less3_student.service;

import less3_student.model.Student;
import less3_student.model.StudentGroup;
import less3_student.view.StudentView;
import less3_student.view.UserView;

import java.util.Collections;
import java.util.List;

public class StudentGroupService {
    private UserView<Student> view = new StudentView();
    private StudentGroup studentGroup;

    public StudentGroupService(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public void addStudent(Student student){
        studentGroup.addStudent(student);
    }
    public boolean dellStudentFromGroup(Student student){
        return studentGroup.dellStudent(student);
    }
    public List<Student> sort(){
        Collections.sort(studentGroup.getStudentGroup());
        return studentGroup.getStudentGroup();
    }

    @Override
    public String toString() {
        return studentGroup.toString();
    }
    public StudentGroup getStudentGroup(){
        return studentGroup;
    }

    public void sendOnConsole(){
        view.sendToConsole(studentGroup.getStudentGroup());
    }
}
