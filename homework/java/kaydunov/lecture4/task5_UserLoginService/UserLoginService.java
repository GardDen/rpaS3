package task5_UserLoginService;

public class UserLoginService {

    boolean login(User user, String password) {
        if (!user.isItBlocked() && user.getPassword().equals(password)) {
            user.resetAttemts();
            return true;
        }
        if (--(user.attemptsBeforeBlocking) == 0) {
            user.blockUser();
        }
        return false;
    }
}
