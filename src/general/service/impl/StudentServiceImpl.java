package general.service.impl;

import general.db.DataBase;
import general.enums.Gender;
import general.exception.MyException;
import general.model.Group;
import general.model.Student;
import general.service.GenericService;
import general.service.StudentService;

import java.util.*;

public class StudentServiceImpl implements StudentService {

    DataBase dataBase = new DataBase();

    @Override
    public String addStudent(List<Student> students) {
        dataBase.setStudents(students);
        return students.toString();
    }

    @Override
    public List<Student> getStudentById(int id) {
        List<Student> students = dataBase.getStudents().stream().filter(x -> x.getId() == id).toList();
        return students;
    }

    @Override
    public List<Student> getAllStudents() {
        return dataBase.getStudents();
    }

    @Override
    public String updateStudentFullName(int id, String fullName) {
        List<Student> students = dataBase.getStudents().stream().filter(x -> {
            if (x.getId() == id) {
                x.setFullName(fullName);

            }
            return false;
        }).toList();
        return students.toString();
    }


    @Override
    public List<Student> filterByGender(int number) {
        System.out.println("1-male and 2 female");
        int a = new Scanner(System.in).nextInt();
        if (a == 1) {
            List<Student> students = dataBase.getStudents().stream().filter(x -> x.getGender().equals(Gender.MALE)).toList();
            return students;
        }else if (a==2){
            List<Student>studentList=dataBase.getStudents().stream().filter(x->x.getGender().equals(Gender.FEMALE)).toList();
            return studentList;
        }
        return null;
    }

    @Override
    public void deleteStudentById(int id) {
        dataBase.getStudents().removeIf(x->x.getId()==id);
        System.out.println("removed!");

    }
}
