package searchIndex;


import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        int v = scanner.nextInt();
        int size = scanner.nextInt();
        int[] sortArray = new int[size];
        for (int i = 0; i < size; i++) {
            sortArray[i] = scanner.nextInt();
        }
        SearchIndex searchIndex = new SearchIndex(sortArray);
        System.out.println(searchIndex.search(v));

    }
}
