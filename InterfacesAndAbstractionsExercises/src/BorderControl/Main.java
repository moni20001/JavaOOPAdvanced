package BorderControl;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Map<String, Buyer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scan.nextLine().split("\\s+");
            if(tokens.length == 3){
                Buyer rebel = new Rebel(tokens[0],Integer.parseInt(tokens[1]),tokens[2]);
                if(!map.containsKey(tokens[0]))
                     map.put(tokens[0],rebel);
            }
            else if(tokens.length == 4){
                Buyer citizen = new Citizen(tokens[0],Integer.parseInt(tokens[1]),tokens[2],tokens[3]);
                if(!map.containsKey(tokens[0]))
                    map.put(tokens[0],citizen);
            }
        }
        String line = scan.nextLine();
        while (!line.equals("End")){
            try {
                Buyer soldier = map.get(line);
                soldier.buyFood();
            }catch (Exception e){}
            line = scan.nextLine();
        }
        long sum = 0;
        for (Map.Entry<String,Buyer> buyer: map.entrySet()) {
            sum += buyer.getValue().returnFood();
        }
        System.out.println(sum);
    }
}
