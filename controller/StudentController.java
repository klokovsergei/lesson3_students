package less3_student.controller;

import less3_student.model.StudentGroup;
import less3_student.model.User;
import less3_student.service.StudentGroupService;

public class StudentController implements UserController{

    @Override
    public <T extends User> User create(T user) {
        return user;
    }
    public void sendOnConsole(StudentGroup studentGroup){
        new StudentGroupService(studentGroup).sendOnConsole();
    }
}
