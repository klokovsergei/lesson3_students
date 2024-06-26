package less3_student.service;

import less3_student.model.Teacher;

public class TeacherService {
    public Teacher createTeacher(String name, String lastName){
        return new Teacher(name, lastName);
    }
    public void addSpesialization(Teacher teacher, String spesialization){
        teacher.addSpesializationList(spesialization);
    }
}
