package evenTree;

import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.*;

public class EvenTreeTest {

    @Test
    public void initializeEvenTree() {
        File file = new File("src/test/java/evenTree/input.txt");
        Scanner in = null;
        try {
            in = new Scanner(file);
            String nodeNumberAndEdgeNumber = in.nextLine();

          //  EvenTree evenTree = new EvenTree(nodeNumberAndEdgeNumber);
            while (in.hasNext()) {
                String t = in.nextLine();
                System.out.println(t);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void when_we_have_10_9_should_return_tree_with_10_node_and_9_edge() {
       /* EvenTree evenTree = new EvenTree("10 9");

        assertThat(evenTree.getNode()).isEqualTo(10);
        assertThat(evenTree.getEdge()).isEqualTo(9);
*/
    }


}