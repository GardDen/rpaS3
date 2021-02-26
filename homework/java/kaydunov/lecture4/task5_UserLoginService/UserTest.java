package task5_UserLoginService;

public class UserTest {
    public static void main(String[] args) {
        User user = new User("Den", "qwerty");
        System.out.println(user);

        user.blockUser();
        System.out.println(user);
    }
}
