package less3_student.service;

import less3_student.model.Teacher;
import less3_student.model.TeacherTeam;
import less3_student.view.TeacherView;
import less3_student.view.UserView;

import java.util.Collections;
import java.util.List;

public class TeacherTeamService {
    private UserView<Teacher> view = new TeacherView();
    private TeacherTeam teacherTeam;

    public TeacherTeamService(TeacherTeam teacherTeam) {
        this.teacherTeam = teacherTeam;
    }

    public void addTeacher(Teacher teacher){
        teacherTeam.addTeacher(teacher);
    }
    public boolean dellTeacherFromTeam(Teacher teacher){
        return teacherTeam.dellTeacher(teacher);
    }
    public List<Teacher> sort(){
        Collections.sort(teacherTeam.getTeacherTeam());
        return teacherTeam.getTeacherTeam();
    }

    @Override
    public String toString() {
        return teacherTeam.toString();
    }
    public TeacherTeam getTeacherTeam(){
        return teacherTeam;
    }

    public void sendOnConsole(){
        view.sendToConsole(teacherTeam.getTeacherTeam());
    }
}
