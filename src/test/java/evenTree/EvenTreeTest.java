package evenTree;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

public class EvenTreeTest {
    private EvenTree evenTree;

    @Test
    public void when_we_have_tree1_cut_should_return_2() {
        Scanner in ;
        int nodeNumber;
        int edgeNumber;
        File file = new File("src/test/java/evenTree/tree1.txt");
        try {
            in = new Scanner(file);
            in.nextLine();
            String[] nodeNumberAndEdgeNumber = in.nextLine().split(" ");

            nodeNumber = Integer.valueOf(nodeNumberAndEdgeNumber[1]);
            edgeNumber = Integer.valueOf(nodeNumberAndEdgeNumber[0]);
            evenTree = new EvenTree(edgeNumber, nodeNumber);
            while (in.hasNext()) {
                nodeNumberAndEdgeNumber = in.nextLine().split(" ");
                nodeNumber = Integer.valueOf(nodeNumberAndEdgeNumber[1]);
                edgeNumber = Integer.valueOf(nodeNumberAndEdgeNumber[0]);
                evenTree.addNode(edgeNumber, nodeNumber);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        assertThat(evenTree.getNodeNumber()).isEqualTo(1);
        assertThat(evenTree.getChildren().get(0).getNodeNumber()).isEqualTo(2);
        assertThat(evenTree.getDescendantQuantity()).isEqualTo(10);
        assertThat(evenTree.cut()).isEqualTo(2);
    }
    @Test
    public void when_we_have_tree2_cut_should_return_tree_with_4() {
        Scanner in ;
        int nodeNumber;
        int edgeNumber ;
        File file = new File("src/test/java/evenTree/tree2.txt");
        try {
            in = new Scanner(file);
            in.nextLine();
            String[] nodeNumberAndEdgeNumber = in.nextLine().split(" ");

            nodeNumber = Integer.valueOf(nodeNumberAndEdgeNumber[1]);
            edgeNumber = Integer.valueOf(nodeNumberAndEdgeNumber[0]);
            evenTree = new EvenTree(edgeNumber, nodeNumber);
            while (in.hasNext()) {
                nodeNumberAndEdgeNumber = in.nextLine().split(" ");
                nodeNumber = Integer.valueOf(nodeNumberAndEdgeNumber[1]);
                edgeNumber = Integer.valueOf(nodeNumberAndEdgeNumber[0]);
                evenTree.addNode(edgeNumber, nodeNumber);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        assertThat(evenTree.cut()).isEqualTo(4);
    }

}