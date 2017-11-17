package BorderControl;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.util.regex.Pattern;

public class Robot implements Soldier {
    private String model;
    private String id;
    private String birthDay;


    public Robot(String model, String id) {
        this.model = model;
        this.id = id;

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
      return "";
    }
}
