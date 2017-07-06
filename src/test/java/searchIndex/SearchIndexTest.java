package searchIndex;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;


public class SearchIndexTest {


    @Test
    public void when_we_have_an_array_1_4_5_7_9_12_searchIndex_of_4_should_return_1() {

        Scanner scanner;
        File file = new File("src/test/java/searchIndex/search.txt");
        try {
            scanner = new Scanner(file);
            int v = scanner.nextInt();
            int size = scanner.nextInt();
            int[] sortArray = new int[size];
            for (int i = 0; i < size; i++) {
                sortArray[i] = scanner.nextInt();
            }
            SearchIndex searchIndex = new SearchIndex(sortArray);
            assertThat(searchIndex.search(v)).isEqualTo(1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}