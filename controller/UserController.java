package less3_student.controller;

import less3_student.model.User;

public interface UserController {
    <T extends User> User create(T user);
}
