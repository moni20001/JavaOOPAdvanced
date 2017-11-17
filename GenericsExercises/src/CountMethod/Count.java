package CountMethod;

import java.util.ArrayList;
import java.util.List;

public class Count {

    public static <T extends Comparable<T>> int getCount(ArrayList<T> list, T elem) {
        ArrayList<T> arrayList = list;
        int count = 0;
        for (T el : arrayList) {
            if (el.compareTo(elem) > 0) {
                count++;
            }
        }
        return count;
    }
}
