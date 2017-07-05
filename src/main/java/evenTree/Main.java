package evenTree;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        EvenTree evenTree;
        int nodeNumber;
        int edgeNumber;
        Scanner in = new Scanner(System.in);
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

        System.out.println(evenTree.cut());
    }
}
