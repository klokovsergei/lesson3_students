package less3_student.view;

import less3_student.model.Teacher;

import java.util.List;

public class TeacherView implements UserView<Teacher> {
    @Override
    public void sendToConsole(List<Teacher> teachers) {
        System.out.println(teachers);
    }
}
