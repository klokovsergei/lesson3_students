package less3_student.model;

import java.util.ArrayList;
import java.util.List;

public class TeacherTeam {
    private List<Teacher> teachers;

    public TeacherTeam() {
        this.teachers = new ArrayList<>();
    }

    public TeacherTeam(List<Teacher> teachers) {
        this.teachers = teachers;
    }
    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }
    public boolean dellTeacher(Teacher teacher){
        int indexTeacher = teachers.indexOf(teacher);
        if ( indexTeacher >= 0){
            teachers.remove(indexTeacher);
            return true;
        } else
            return false;

    }
    public List<Teacher> getTeacherTeam(){
        return teachers;
    }

    @Override
    public String toString(){
        return "В образовательном учреждении преподают: " + teachers.toString();
    }
}
