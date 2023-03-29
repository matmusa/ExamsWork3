package general.db;

import general.model.Group;
import general.model.Student;

import java.util.List;

public class DataBase {

    private List<Group>groups;
    private List<Student>students;



    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "\nDataBase :" +
                "\ngroups :" + groups +
                "\n students=" + students
                ;
    }
}
