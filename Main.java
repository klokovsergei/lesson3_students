package less3_student;

import less3_student.controller.StudentController;
import less3_student.controller.TeacherController;
import less3_student.model.Student;
import less3_student.model.StudentGroup;
import less3_student.model.Teacher;
import less3_student.model.TeacherTeam;
import less3_student.service.StudentGroupService;
import less3_student.service.TeacherTeamService;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Sasha", "Ivanov", "инженер");
        Student student2 = new Student("Tanya", "Petrova", "инженер");
        StudentGroupService studentGroupService = new StudentGroupService(new StudentGroup());
        studentGroupService.addStudent(student1);
        studentGroupService.addStudent(student2);
        StudentGroup studentGroup1 = studentGroupService.getStudentGroup();
        new StudentController().sendOnConsole(studentGroup1);

        TeacherTeam teacherTeam = new TeacherTeam();
        TeacherTeamService teacherTeamService = new TeacherTeamService(teacherTeam);
        TeacherController teacherController = new TeacherController();
        teacherTeam.addTeacher(new Teacher("Maria", "Ivanovna"));
        teacherController.sendOnConsole(teacherTeamService.getTeacherTeam());

    }


}
