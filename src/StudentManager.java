public class StudentManager extends UserManager {

    public void register(User user){
        System.out.println("Öğrenci başarıyla kaydoldu : " + user.getFirstName());
    }
}
