package appendAndDelete;

import java.util.Scanner;

public class Main {

    public static void main(String [] args){

        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int k = in.nextInt();

        AppendAndDelete appendAndDelete = new AppendAndDelete(s, t, k);
        appendAndDelete.possibleString();

    }
}
