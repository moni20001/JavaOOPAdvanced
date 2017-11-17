package ListUtils;

import java.util.ArrayList;
import java.util.List;

public class ListUtils {

    public static <T extends Comparable<T>> T getMin(List<T> list){
    if(list.size() == 0) {
        throw new IllegalArgumentException();
    }
        T min = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if(min.compareTo(list.get(i)) >0){
                min = list.get(i);
            }
        }
    return min;

    }

    public static <T extends Comparable<T>> T getMax(List<T> list){
        if(list.size() == 0) {
            throw new IllegalArgumentException();
        }
        T min = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if(min.compareTo(list.get(i)) < 0){
                min = list.get(i);
            }
        }
        return min;

    }


    public static <T> List<Integer> getNullIndices(List<T> list){
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) == null){
                indices.add(i);
            }

        }
        return indices;
    }

    public static <T> void  flatten(List<T> destination, List<List<T>> source){
        for (List<T> list: source) {
            for (T e: list) {
                destination.add(e);
            }
        }

    }

    public static <T> void addAll(List<T> destination, List<T> source){
        for (T e: source) {
            destination.add(e);
        }

    }

}
