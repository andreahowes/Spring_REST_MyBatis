package mybatis.model;

//user module
public class User {

    private int id;
    private String first_name;
    private String last_name;
    private int isActive;

    //constructor
    public User(int id, String first_name, String last_name, int isActive) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.isActive = isActive;
    }
    //empty constructor
    public User() {
    }

    //getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getIsActive() {
        return isActive;
    }

    public void setIsActive(int active) {
        isActive = active;
    }
}
