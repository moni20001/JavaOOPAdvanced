package Threeuple;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] firstLine = scan.nextLine().split("\\s+");
        String firstLastName = firstLine[0] + " " + firstLine[1];
        Threeuple truple1 = new Threeuple(firstLastName,firstLine[2],firstLine[3]);

        String[] secondLine = scan.nextLine().split("\\s+");
        boolean isDrunk = secondLine[2].equals("drunk");
        Threeuple truple2 = new Threeuple(secondLine[0],Integer.parseInt(secondLine[1]),isDrunk);

        String[] thirdLine = scan.nextLine().split("\\s+");
        Threeuple truple3 = new Threeuple(thirdLine[0],Double.parseDouble(thirdLine[1]),thirdLine[2]);


        System.out.println(truple1);
        System.out.println(truple2);
        System.out.println(truple3);
    }
}
