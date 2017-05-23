package bigNumber;

import java.util.Scanner;

public class Main {

    public static void main(String args []){

        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();
        scanner.nextLine();
        String numberToCompute = scanner.nextLine();

        BigNumber bigNumber = new BigNumber(quantity, numberToCompute);
        System.out.println(bigNumber.sum());
    }
}
