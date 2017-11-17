package CustomList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CustomList<String> list = new CustomList<String>();
        String line = scan.nextLine();
        while (!line.equals("END")) {
            String[] commandArg = line.split("\\s+");
            switch (commandArg[0]) {
                case "Add":
                    list.add(commandArg[1]);
                    break;
                case "Remove":
                    list.remove(Integer.parseInt(commandArg[1]));
                    break;
                case "Contains":
                    if (list.contains(commandArg[1])) {
                        System.out.println("true");
                    } else
                        System.out.println("false");
                    break;
                case "Swap":
                    list.swap(Integer.parseInt(commandArg[1]), Integer.parseInt(commandArg[2]));
                    break;
                case "Greater":
                    System.out.println(list.countGreaterThan(commandArg[1]));
                    break;
                case "Max":
                    System.out.println(list.getMax());
                    break;
                case "Min":
                    System.out.println(list.getMin());
                    break;
                case "Print":
                        list.printList();
                        break;
                case "Sort":
                    list.sort();
                    break;

            }
            line = scan.nextLine();
        }
    }
}
