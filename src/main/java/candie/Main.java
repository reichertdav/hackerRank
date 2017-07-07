package candie;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Candie candie = new Candie();
        int studentQuantity = in.nextInt();
        int[] studentRank = new int[studentQuantity];

        for (int i = 0; i < studentQuantity; i++) {
            studentRank[i] = in.nextInt();
        }

        System.out.println(candie.ditrib(studentRank));
    }
}
