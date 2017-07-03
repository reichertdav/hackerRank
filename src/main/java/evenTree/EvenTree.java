package evenTree;

import java.util.ArrayList;
import java.util.List;

public class EvenTree {

    private int nodeNumber;
    private int descendantQuantity;
    private List<EvenTree> children;
    private EvenTree father;

    public EvenTree(int edgeNumber, int nodeNumber) {
        if (children.isEmpty()) {
            this.nodeNumber = nodeNumber;
            children.add(new EvenTree(edgeNumber));
        } else {
            for (EvenTree child : children) {
                if (child.nodeNumber == nodeNumber) {
                    children.add(new EvenTree(edgeNumber));
                }else{

                }
            }
        }
    }

    public EvenTree(int nodeNumber) {
        this.nodeNumber = nodeNumber;
        this.descendantQuantity = 0;
        this.children = new ArrayList<>();
    }


}
