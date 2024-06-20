package less3_student.service;

import less3_student.model.Student;
import less3_student.model.StudentGroup;

public class StudentGroupService {
    StudentGroup studentGroup;

    public StudentGroupService(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }
    public void dellStudentFromGroup(Student student){
        if (studentGroup.students.indexOf(student.name) < 0)
            System.out.println("Нет такого студента!");
        else {
            int positionStudent = studentGroup.students.indexOf(student.name);
            int firstIndex = positionStudent - "Student:".length();
            int lastIndex = positionStudent + student.name.length() + 1;
            studentGroup.students.delete(firstIndex, lastIndex);
            System.out.println("Студент " + student.name + " удален из группы.");
        }
    }
}
