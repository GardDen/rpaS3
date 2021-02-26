package task5_UserLoginService;

public class UserLoginServiceTest {
    public static void main(String[] args) {
        UserLoginService service = new UserLoginService();
        User userOne = new User("user-login", "user-password");
        System.out.println(service.login(userOne, "user-password-12345")); //Should return false
        User userTwo = new User("user-Two", "123");
        System.out.println(service.login(userTwo, "123")); //Should return false

    }
}
