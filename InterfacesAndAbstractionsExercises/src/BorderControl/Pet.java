package BorderControl;

import java.util.regex.Pattern;

public class Pet implements Soldier{
    private String name;
    private String birthDay;

    public Pet(String name, String birthDay) {
        this.name = name;
        this.birthDay = birthDay;
    }

    @Override
    public String catchFake(String n) {
        return null;
    }

    @Override
    public String endDate(String year) {
        if(Pattern.matches(Soldier.pattern,this.birthDay) && this.birthDay.endsWith(year)){
            return this.birthDay;
        }
        return "";
    }
}
