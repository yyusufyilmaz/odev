public class Student extends User {
    private String coursesTaken;


    public Student(int _id, String _firstName, String _lastName, String _email, String _password, String _coursesTaken){
        super(_id,_firstName,_lastName,_email,_password);
        this.coursesTaken = _coursesTaken;
    }

    public String getCoursesTaken() {
        return coursesTaken;
    }

    public void setCoursesTaken(String coursesTaken) {
        this.coursesTaken = coursesTaken;
    }
}