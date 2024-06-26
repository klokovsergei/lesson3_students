package less3_student.view;

import less3_student.model.Student;

import java.util.List;

public class StudentView implements UserView<Student>{
    @Override
    public void sendToConsole(List<Student> users) {
        System.out.println(users);
    }
}
