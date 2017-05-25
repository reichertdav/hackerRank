package dayOfProgrammer;

import java.util.Scanner;

public class Main {

    public static void main(String [] args){


        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        DayOfProgrammer dayOfProgrammer = new DayOfProgrammer(year);
        System.out.println(dayOfProgrammer.getDate());
    }



}

