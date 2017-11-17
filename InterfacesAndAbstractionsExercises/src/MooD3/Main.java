package MooD3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] tokens = scan.nextLine().split("\\|");
        String username = tokens[0].trim();
        String type = tokens[1].trim();
        double specialPoints = Double.parseDouble(tokens[2].trim());
        int level = Integer.parseInt(tokens[3].trim());
        GameObject obj = null;
        if(type.equals("Demon")){
          obj = new Demon(username,specialPoints,level);
        }else if(type.equals("Archangel")){
            obj = new Archangel(username,(int)specialPoints,level);
        }
        System.out.println(obj.toString());
    }
}
