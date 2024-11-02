package food.ordering.system;

public class User {

    private String user;
    private int id;
    private String password;

    public User(String user, int id, String password) {
        this.setUser(user);
        this.setId(id);
        this.setPassword(password);
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean checkUser(int id, String password) {
        return getPassword().equals(password) && getId() == id;
    }
}
