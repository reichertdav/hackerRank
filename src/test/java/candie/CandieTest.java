package candie;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.*;


public class CandieTest {

    @Test
    public void when_we_have_1_2_2student_distrib_should_return_4() {
        Scanner in;
        File file = new File("src/test/java/candie/studentClass1.txt");
        Candie candie = new Candie();
        try {
            in = new Scanner(file);
            int studentQuantity = in.nextInt();
            int[] studentRank = new int[studentQuantity];

            for (int i = 0; i < studentQuantity; i++) {
                studentRank[i] = in.nextInt();
            }
            assertThat(candie.ditrib(studentRank)).isEqualTo(4);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}