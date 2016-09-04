package Module3.Task3;

import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Course course1 = new Course(new Date(), "Trade");
        Course course2 = new Course(12, "B1", "Bobi");
        Course course3 = new Course(13, "B2", "Mobi");
        Course course4 = new Course(14, "B3", "Fobi");
        Course course5 = new Course(15, "B4", "Dobi");

        Student student1 = new Student("Петров", "Петр", 22  );
        Student student2 = new Student("Петров", new Course[]{course2});

        CollegeStudent collegeStudent1 = new CollegeStudent("Иванов", "Иван", 11);
        CollegeStudent collegeStudent2 = new CollegeStudent("Иванов", new Course[] {course3});
        CollegeStudent collegeStudent3 = new CollegeStudent("OdessaCollege", 1000, 999999999);

        SpecialStuden specialStuden1 = new SpecialStuden("Васильев", "Василий", 12);
        SpecialStuden specialStuden2 = new SpecialStuden("Васильев", new Course[] {course4});
        SpecialStuden specialStuden3 = new SpecialStuden(123456, "vasilMail");

        System.out.println();
        System.out.println("Course");
        System.out.println(course1.getStartDate() + ", "+course1.getName());
        System.out.println(course2.getHoursDuration() + ", "+course2.getTeacherName() + ", " + course2.getName());
        System.out.println(course3.getHoursDuration() + ", " + course3.getTeacherName() + ", " + course3.getName());
        System.out.println(course4.getHoursDuration() + ", " + course4.getTeacherName() + ", " + course4.getName());
        System.out.println(course5.getHoursDuration() + ", " + course5.getTeacherName() + ", " + course5.getName());

        System.out.println();
        System.out.println("Student");
        System.out.println(student1.getFirstNme() + ", " + student1.getLastName() + ", " + student1.getGroup());
        System.out.println(student2.getLastName()+" "+Arrays.toString(student2.getCoursesTaken()));

        System.out.println();
        System.out.println("CollegeStudent");
        System.out.println(collegeStudent1.getFirstNme() + ", " + collegeStudent1.getLastName() + ", " + collegeStudent1.getGroup());
        System.out.println(collegeStudent2.getLastName() + ", " + Arrays.toString(collegeStudent2.getCoursesTaken()));
        System.out.println(collegeStudent3.getCollegeName() + ", " + collegeStudent3.getRating() + ", " + collegeStudent3.getId());

        System.out.println();
        System.out.println("SpecialStudent");
        System.out.println(specialStuden1.getFirstNme() + ", " + specialStuden1.getLastName() + ", " + specialStuden1.getGroup());
        System.out.println(specialStuden2.getLastName() + ", " + Arrays.toString(specialStuden2.getCoursesTaken()));
        System.out.println(specialStuden3.getSecretKey() + ", " + specialStuden3.getEmail());




    }
}
