package day01;

public class NormalUser implements User {

    private final String userEmail;
    private final String password;

    public NormalUser(String userEmail, String password) {
        this.userEmail = userEmail;
        this.password = password;
    }

    @Override
    public String getUserEmail() {
        return userEmail;
    }

    @Override
    public String getPassword() {
        return password;
    }
}
