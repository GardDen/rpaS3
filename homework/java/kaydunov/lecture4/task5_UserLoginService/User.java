package task5_UserLoginService;

public class User {
    String login;
    private String password;
    private boolean isItBlocked = false;
    public int attemptsBeforeBlocking = 3;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void resetAttemts() {
        attemptsBeforeBlocking = 3;
    }

    public void blockUser() {
        isItBlocked = true;
    }

    public String getPassword() {
        return password;
    }

    public boolean isItBlocked() {
        return isItBlocked;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", isItBlocked=" + isItBlocked +
                ", attemptsBeforeBlocking=" + attemptsBeforeBlocking +
                '}';
    }
}
