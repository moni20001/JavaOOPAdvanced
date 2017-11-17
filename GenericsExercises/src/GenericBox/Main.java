package GenericBox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            Integer temp = Integer.parseInt(scan.nextLine());
            Box<Integer> box = new Box<>(temp);
            System.out.println(box.toString());
        }
    }
}
