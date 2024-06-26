package less3_student.service;

import less3_student.model.Student;

public class StudentService {
    public Student createStudent(String name, String lastName, String birthday){
        return new Student(name, lastName, birthday);
    }

}
