package GenericSwapMethod;

import GenericSwapMethod.Box;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<Box<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Box box = new Box(Integer.parseInt(scan.nextLine()));
            list.add(box);

        }
        int[] numbers = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        Box<Integer> firstElem = list.get(numbers[0]);
        Box<Integer> secondElem = list.get(numbers[1]);

        list.set(numbers[0],secondElem);
        list.set(numbers[1],firstElem);

        for (Box<Integer> box:list) {
            System.out.println(box.toString());
        }
    }
}
