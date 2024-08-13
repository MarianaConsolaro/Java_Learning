public class User {
    public String username;
    public String password;
    public String email;
    public boolean active;

    public User() {

    }

    public User(String username, String password, String email) {
        this.email = email;
        this.username = username;
        this.password = password;
     
    }

    public boolean isActive() {
        return active;
    }
}
