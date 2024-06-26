package less3_student.controller;

import less3_student.model.Teacher;
import less3_student.model.TeacherTeam;
import less3_student.model.User;
import less3_student.service.TeacherService;
import less3_student.service.TeacherTeamService;

public class TeacherController implements UserController{
    @Override
    public <T extends User> User create(T user) {
        return user;
    }
    public void sendOnConsole(TeacherTeam teacherTeam){
        new TeacherTeamService(teacherTeam).sendOnConsole();
    }
    public void addSpesialization(Teacher teacher, String spesialization) {
        new TeacherService().addSpesialization(teacher, spesialization);
    }
}
