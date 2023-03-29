import general.enums.Gender;
import general.model.Group;
import general.model.Student;
import general.service.impl.GroupServiceImpl;
import general.service.impl.StudentServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Group group = new Group(1, "java", "qwerty", 2020);
        Group group2 = new Group(2, "js", "qwerty", 2021);
        Group group3 = new Group(3, "python", "qwerty", 2022);
        Group group4 = new Group(4, "c++", "qwerty", 2023);
        Group group5 = new Group(5, "C#", "qwerty", 2024);
        Group group6 = new Group(6, "bingo", "qwerty", 2025);
        List<Group> groups = new ArrayList<>(Arrays.asList(group2, group6, group3, group4, group5, group));
        String newName = "Mata";
        Student student = new Student(1, "Matmusa", 21, Gender.MALE);
        Student student2 = new Student(2, "Marat", 23, Gender.MALE);
        Student student3 = new Student(3, "Mahabat", 29, Gender.FEMALE);
        Student student4 = new Student(4, "Minura", 18, Gender.FEMALE);
        Student student5 = new Student(5, "Maksat", 32, Gender.MALE);
        Student student6 = new Student(6, "Kubat", 40, Gender.MALE);
        Student student7 = new Student(7, "Nariza", 18, Gender.FEMALE);
        List<Student> students = new ArrayList<>(Arrays.asList(student2, student7, student3, student4, student5, student6, student));
        GroupServiceImpl groupService = new GroupServiceImpl();
        StudentServiceImpl studentService = new StudentServiceImpl();
        groupService.addNewGroup(groups);

        while (true) {
            System.out.println("1.Add new group\n" +
                    " 2. Get group by id \n" +
                    " 3. Get all groups\n" +
                    " 4. Update group name\n" +
                    " 5. Filter by year\n" +
                    " 6. Sort group by year\n" +
                    " 7. Delete group by id\n" +
                    " 8.Add student\n" +
                    " 9. Get student by id\n" +
                    " 10. Get all students\n" +
                    " 11. Update student full name\n" +
                    " 12. filterByGender();\n" +
                    " 13.delete student by id");


            int a = new Scanner(System.in).nextInt();
            switch (a) {

                case 1 -> System.out.println(groupService.addNewGroup(groups));
                case 2 -> System.out.println(groupService.getGroupById(group2.getId()));
                case 3 -> System.out.println(groupService.getAllGroups());
                case 4 -> System.out.println(groupService.updateGroupName(group3.getId(), newName));
                case 5 -> System.out.println(groupService.filterByYear());
                case 6 -> System.out.println(groupService.sortGroupByYear());
                case 7 -> groupService.deleteGroupById(group6.getId());
                case 8 -> System.out.println(studentService.addStudent(students));
                case 9 -> System.out.println(studentService.getStudentById(student4.getId()));
                case 10 -> System.out.println(studentService.getAllStudents());
                case 11 -> System.out.println(studentService.updateStudentFullName(student3.getId(), newName));
                case 12 -> System.out.println(studentService.filterByGender(3));
                case 13 -> studentService.deleteStudentById(student.getId());

            }

        }
    }
}