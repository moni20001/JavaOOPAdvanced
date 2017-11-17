package Telephony;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] phoneTokens = scan.nextLine().split("\\s+");
        String[] sitesTokens = scan.nextLine().split("\\s+");
        Smartphone smartphone = new Smartphone();

        for (int i = 0; i < phoneTokens.length; i++) {
            smartphone.callPhone(phoneTokens[i]);
        }
        for (int i = 0; i < sitesTokens.length; i++) {
            smartphone.browseSite(sitesTokens[i]);
        }

    }
}
