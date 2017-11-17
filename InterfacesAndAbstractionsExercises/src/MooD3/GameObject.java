package MooD3;

public abstract class GameObject {
    private String username;
    private String hashedPassword;
    private int level;

    public GameObject(String username,int level) {
        this.username = username;
        this.level = level;
    }

    public String getUsername() {
        return username;
    }

    public int getLevel() {
        return level;
    }
}
