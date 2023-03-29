package general.service;

import general.model.Student;

import java.util.List;

public interface StudentService {
    String addStudent(List<Student>students);

    List<Student> getStudentById(int id);

    List<Student> getAllStudents();

    String updateStudentFullName(int id, String fullName);

    //with stream (1 ди басканда female, 2 ни басканда male кылып фильтрлесин)
    List<Student> filterByGender(int number);

    void deleteStudentById(int id);

}
