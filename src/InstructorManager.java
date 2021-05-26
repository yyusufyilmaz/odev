public class InstructorManager extends UserManager {

    public void login(User user){
        System.out.println("Eğitmen başarıyla giriş yaptı : " + user.getFirstName());
    }
}
