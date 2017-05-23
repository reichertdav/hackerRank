package birthdayCake;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by david on 5/22/17.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height[] = new int[n];
        List<Integer> candle = new ArrayList<Integer>();
        for(int height_i=0; height_i < n; height_i++){
            candle.add(in.nextInt());
        }

        BirthdayCake birthday = null;
        try {
            birthday = new BirthdayCake(n, candle);
        } catch (SizeException e) {
            e.printStackTrace();
        }
        System.out.println(birthday.blow());

    }
}
