package kangaroo;

import java.util.Scanner;

public class Main {

    public static void main(String args []){
        Scanner scanner = new Scanner(System.in);
        String kangaroo = scanner.nextLine();
        String[] kangarooArguments = kangaroo.split(" ");
        int x1 = Integer.parseInt(kangarooArguments[0]);
        int v1 = Integer.parseInt(kangarooArguments[1]);
        int x2 = Integer.parseInt(kangarooArguments[2]);
        int v2 = Integer.parseInt(kangarooArguments[3]);

        Kangaroo kangarooFirst = new Kangaroo(x1, v1);
        Kangaroo kangarooSecond = new Kangaroo(x2, v2);

        boolean result = kangarooFirst.isCatch(kangarooSecond);
        if(result){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}
