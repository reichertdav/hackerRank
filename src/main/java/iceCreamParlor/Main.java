package iceCreamParlor;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int turnNumber = scan.nextInt();
        for (int t = 0; t < turnNumber; t++) {
            int m = scan.nextInt();
            int n = scan.nextInt();
            scan.nextLine();
            String posibilities = scan.nextLine();

            IceCreamParlor iceCreamParlor = new IceCreamParlor(m, n, posibilities);
            System.out.println(iceCreamParlor.foundBestCombinaison());
        }

    }
}
