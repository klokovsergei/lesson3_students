package less3_student;

import less3_student.model.Student;
import less3_student.model.StudentGroup;
import less3_student.model.StudentGroupStream;
import less3_student.service.StudentGroupService;
import less3_student.util.StudentGroupComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentGroup studentGroup1 = new StudentGroup();
        Student student1 = new Student("Petya");
        studentGroup1.addStudent(student1);
        studentGroup1.addStudent(new Student("Olga"));
        studentGroup1.addStudent(new Student("Max"));
//
        StudentGroup studentGroup2 = new StudentGroup();
        studentGroup2.addStudent(new Student("Sonya"));
        studentGroup2.addStudent(new Student("Ivan"));
        studentGroup2.addStudent(new Student("Glasha"));
        studentGroup2.addStudent(new Student("Valentina"));

        StudentGroup studentGroup3 = new StudentGroup();
        studentGroup3.addStudent(new Student("Kostya"));

//        Iterator<Student> iterator = new StudentGroupIterator(studentGroup);
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
        for (Student s: studentGroup1) {
            System.out.println(s);
        }
//        List<Student> list = new ArrayList<>();
//        list.add(new Student("Petya"));
//        list.add(new Student("Olga"));
//        list.add(new Student("Maximovich"));
//        System.out.println(list);
//        Collections.sort(list, Comparator.reverseOrder());
//        System.out.println(list);
////        Collections.sort(list, new StudentComparator());
//        System.out.println(list);
//        Collections.sort(list, (s1, s2) -> s1.id - s2.id);
//        System.out.println(list);

        // итерация по ПОТОКАМ
        StudentGroupStream studentGroupStream = new StudentGroupStream();
        studentGroupStream.addStrudentGroup(studentGroup1);
        studentGroupStream.addStrudentGroup(studentGroup2);
        studentGroupStream.addStrudentGroup(studentGroup3);
        for (StudentGroup sg: studentGroupStream){
            System.out.println(sg);
        }
        List<StudentGroup> studentGroupList = new ArrayList<>();
        studentGroupList.add(studentGroup1);
        studentGroupList.add(studentGroup2);
        studentGroupList.add(studentGroup3);
        System.out.println(studentGroupList);
        Collections.sort(studentGroupList, new StudentGroupComparator());
        System.out.println(studentGroupList);

        System.out.println(studentGroupStream);

        studentGroupStream.getShowSortSudentGroup();

        //сервис по удалению студентов из группы
        StudentGroupService studentGroupService = new StudentGroupService(studentGroup1);
        studentGroupService.dellStudentFromGroup(new Student("Sanya"));
        studentGroupService.dellStudentFromGroup(student1);
        System.out.println(studentGroup1);
    }
}
