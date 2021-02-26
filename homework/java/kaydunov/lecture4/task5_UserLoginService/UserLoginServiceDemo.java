package task5_UserLoginService;

public class  UserLoginServiceDemo {
    public static void main(String[] args) {
        UserLoginService service = new UserLoginService();
        User userTwo = new User("user-Two", "333");
        System.out.println("Test - 1");
        System.out.println(service.login(userTwo, "111"));
        System.out.println(userTwo);
        System.out.println(service.login(userTwo, "222"));
        System.out.println(userTwo);
        System.out.println(service.login(userTwo, "333"));
        System.out.println(userTwo);

        System.out.println("\nTest - 2");
        System.out.println(service.login(userTwo, "111"));
        System.out.println(userTwo);
        System.out.println(service.login(userTwo, "222"));
        System.out.println(userTwo);
        System.out.println(service.login(userTwo, "123"));
        System.out.println(userTwo);
        System.out.println(service.login(userTwo, "333"));
        System.out.println(userTwo);
        userTwo.resetAttemts();
        System.out.println(userTwo);
        System.out.println(service.login(userTwo, "333"));


    }
}
