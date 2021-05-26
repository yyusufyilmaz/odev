public class Main {

    public static void main(String[] args) {
        Student student = new Student(1,"Yusuf","Yılmaz","yusuf_alp07@hotmail.com","password","JAVA, C#");
        Instructor instructor = new Instructor(2,"Engin","Demiroğ","engindemirog@mail.com","password","JAVA,C#,Programlamaya Giriş");
        User[] users = new User[]{student,instructor};

        UserManager userManager = new UserManager();
        userManager.view(users);

        StudentManager studentManager = new StudentManager();
        studentManager.register(student);
        InstructorManager instructorManager = new InstructorManager();
        instructorManager.login(instructor);

    }
}
