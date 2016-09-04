package Module3.Task3;

public class CollegeStudent extends Student{
    private String collegeName;
    private int rating;
    private long id;

    CollegeStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);

    }

    CollegeStudent(String lastName, Course[] courseTaken){
        super(lastName, courseTaken);
    }

    CollegeStudent(String collegeName, int rating, long id){
        this.collegeName = collegeName;
        this.rating = rating;
        this.id = id;
    }

    public CollegeStudent() {

    }

    public String getCollegeName() {
        return collegeName;
    }

    public int getRating() {
        return rating;
    }

    public long getId() {
        return id;
    }


}
