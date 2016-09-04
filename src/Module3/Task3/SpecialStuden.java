package Module3.Task3;

public class SpecialStuden extends CollegeStudent{
    private long secretKey;
    private String email;


    SpecialStuden(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    SpecialStuden(String lastName, Course[] courseTaken) {
        super(lastName, courseTaken);
    }

    SpecialStuden(long secretKey, String email){
        this.secretKey = secretKey;
        this.email = email;
    }

    public long getSecretKey() {
        return secretKey;
    }

    public String getEmail() {
        return email;
    }

    public void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
