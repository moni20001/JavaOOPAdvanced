package GenericArrayCreator;

public class Main {
    public static void main(String[] args) {
        String[] arrayOfStrings = ArrayCreator.create(10,"none");
        Integer[] integers = ArrayCreator.create(Integer.class,10,10);
    }
}
