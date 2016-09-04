package Module3.Task3;

import java.util.Date;

public class Course {
    private Date startDate;
    private String name;
    private int hoursDuration;
    private String teacherName;

    Course(Date startDate, String name) {
        this.startDate = startDate;
        this.name = name;
    }

    Course(int hoursDuration, String name, String teacherName) {
        this.hoursDuration = hoursDuration;
        this.teacherName = teacherName;
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public String getName() {
        return name;
    }

    public int getHoursDuration() {
        return hoursDuration;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setStartDate(Date startDate) {
        Date date1 = new Date();
        this.startDate = startDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHoursDuration(int hoursDuration) {
        this.hoursDuration = hoursDuration;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }


    @Override
    public String toString() {
        return this.hoursDuration + ", " + this.name + ", " + this.teacherName;
    }



}
