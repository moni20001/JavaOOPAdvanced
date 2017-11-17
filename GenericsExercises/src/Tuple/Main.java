package Tuple;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] firstLine = scan.nextLine().split("\\s+");
        String firstLastName = firstLine[0] + " " + firstLine[1];
        Tuple tuple = new Tuple(firstLastName,firstLine[2]);
        String[] secondLine = scan.nextLine().split("\\s+");
        Tuple tuple1 = new Tuple(secondLine[0],Integer.parseInt(secondLine[1]));
        String[] thirdLine = scan.nextLine().split("\\s+");
        Tuple tuple2 = new Tuple(Integer.parseInt(thirdLine[0]),Double.parseDouble(thirdLine[1]));
        System.out.println(tuple);
        System.out.println(tuple1);
        System.out.println(tuple2);
    }
}
