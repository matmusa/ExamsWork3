package general.model;

import general.enums.Gender;

public class Student {

    private int id;
    private String fullName;
    private int age;
    private Gender gender;

    public Student() {
    }

    public Student(int id, String fullName, int age, Gender gender) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
    }

    public Student(String fullName, int age, Gender gender) {
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Student(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "\nStudent :" +
                "\nid :"+id+
                "\nfullName :" + fullName +
                "\nage :" + age +
                "\ngender :" + gender;


    }
}
