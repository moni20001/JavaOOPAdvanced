package BorderControl;

import java.util.regex.Pattern;

public class Citizen implements Soldier,Buyer {
   private String name;
   private int age;
   private String id;
    private String birthDay;
    private int food;

    public Citizen(String name, int age, String id,String birthDay) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDay = birthDay;
        this.food = 0;
    }


    @Override
    public String catchFake(String n) {
        if(this.id.endsWith(n))
            return this.id;
        else
            return "";
    }

    @Override
    public String endDate(String year) {
        if(Pattern.matches(Soldier.pattern,this.birthDay) && this.birthDay.endsWith(year)){
            return this.birthDay;
        }
        return "";
    }

    @Override
    public void buyFood() {
        this.food += 10;
    }

    @Override
    public int returnFood() {
        return this.food;
    }
}
