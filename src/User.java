public class User {
    private String username;
    private String password;

    public User() {
        username = "admin";
        password = "1234";
    }

    public boolean login(String username, String password) {
        return this.username.equals(username)
                && this.password.equals(password);
    }
}