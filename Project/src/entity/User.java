package entity;

public class User {
    private String user_id;
    private String user_name;
    private String full_name;
    private String passWord;
    private String role;
    private String user_status;

    public User(String user_id, String user_name, String full_name, String passWord, String role, String user_status) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.full_name = full_name;
        this.passWord = passWord;
        this.role = role;
        this.user_status = user_status;
    }

    public User(String user_name, String passWord, String full_name) {
        this.user_name = user_name;
        this.passWord = passWord;
        this.full_name = full_name;
        this.role = "CUSTOMER";
        this.user_status = "ACTIVE";
    }

    public User() {}

    public String getUser_id() { return user_id; }
    public void setUser_id(String user_id) { this.user_id = user_id; }

    public String getUser_name() { return user_name; }
    public void setUser_name(String user_name) { this.user_name = user_name; }

    public String getFull_name() { return full_name; }
    public void setFull_name(String full_name) { this.full_name = full_name; }

    public String getPassWord() { return passWord; }
    public void setPassWord(String passWord) { this.passWord = passWord; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public String getUser_status() { return user_status; }
    public void setUser_status(String user_status) { this.user_status = user_status; }
}