package Module3.Task3;

import java.util.Arrays;

public class Student {
    private String firstNme;
    private String lastName;
    private int age;
    private int group;
    private Course [] coursesTaken;


    Student(String firstName, String lastName, int group ){
        this.firstNme = firstName;
        this.lastName = lastName;
        this.group = group;
    }

    Student(String lastName, Course [] coursesTaken){
        this.lastName = lastName;
        this.coursesTaken = coursesTaken;
    }


    public Student() {
    }


    public String getFirstNme() {
        return firstNme;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getGroup() {
        return group;
    }


    public void setCoursesTaken(Course[] coursesTaken) {
        this.coursesTaken = coursesTaken;
    }

    public void setFirstNme(String firstNme) {
        this.firstNme = firstNme;

    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGroup(int group) {
        this.group = group;
    }


    public Course[] getCoursesTaken() {
        return coursesTaken;
    }




}
