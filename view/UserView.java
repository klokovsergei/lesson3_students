package less3_student.view;

import less3_student.model.User;

import java.util.List;

public interface UserView<T extends User> {
    void sendToConsole(List<T> users);
}
