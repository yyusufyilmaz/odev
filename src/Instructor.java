public class Instructor extends User {
    private String coursesGiven;


    public Instructor(int _id, String _firstName, String _lastName, String _email, String _password, String _coursesGiven){
        super(_id,_firstName,_lastName,_email,_password);
        this.coursesGiven = _coursesGiven;
    }


    public String getCoursesGiven() {
        return coursesGiven;
    }

    public void setCoursesGiven(String coursesGiven) {
        this.coursesGiven = coursesGiven;
    }
}
