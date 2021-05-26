public class UserManager {
    public void view(User[] users){
        for (User user : users){
            System.out.println("Kullanıcı görüntüleniyor. Kullanıcının adı : " + user.getFirstName());
        }
    }
}
