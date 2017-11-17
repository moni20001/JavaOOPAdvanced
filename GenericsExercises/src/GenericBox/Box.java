package GenericBox;

import java.util.ArrayList;

public class Box <T> {
    private T param;

    public Box(T param) {
        this.param = param;
    }

    @Override
    public String toString() {
        return this.param.getClass().getTypeName()+": "+this.param;
    }
}
