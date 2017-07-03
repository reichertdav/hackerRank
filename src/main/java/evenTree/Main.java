package evenTree;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;

public class Main {

    public static void mainFromFile(String args []){

    }

    public void test(){
        URL url = getClass().getResource("input.txt");
        File file = new File(url.getPath());
        Scanner in = null;
        try {
            in = new Scanner(file);
            String t = in.nextLine();
            System.out.println(t);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
