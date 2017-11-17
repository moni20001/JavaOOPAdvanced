package BorderControl;

public class Rebel implements Soldier,Buyer {
    private String name;
    private int age;
    private String group;
    private int food;

    public Rebel(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
        this.food = 0;
    }

    @Override
    public void buyFood() {
        this.food += 5;
    }

    @Override
    public int returnFood() {
        return this.food;
    }

    @Override
    public String catchFake(String n) {
        return null;
    }

    @Override
    public String endDate(String year) {
        return null;
    }
}
