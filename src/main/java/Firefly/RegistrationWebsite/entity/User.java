package Firefly.RegistrationWebsite.entity;

public class User {
    private Integer id;

    private Integer flag;

    private String username;

    public User(Integer id, Integer flag, String username) {
        this.id = id;
        this.flag = flag;
        this.username = username;
    }
    public User() {

    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }
}